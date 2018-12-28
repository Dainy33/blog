package blog.utils;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

class Cloud{

    public String cloudName;
    public HashMap<String, String> envConfig = new HashMap<String, String>();

    public Cloud(String name){
        this.cloudName = name;
    }

    public String getConfig(String key){
        if (envConfig.containsKey(key)){
            return envConfig.get(key);
        }else{
            return null;
        }

    }

}

public class ConfigLoader {

    HashMap<String, Cloud> clouds = new HashMap<String, Cloud>();

    public Cloud getCloud(String name){
        return clouds.get(name);
    }

    public void loadConfig(){
        try{
            InputStream ins = this.getClass().getClassLoader().getResourceAsStream("com/aliyun/ops/opsapi/test/cloud.conf");
            BufferedReader reader = new BufferedReader(new InputStreamReader(ins));
            String line;
            String env = null;
            Cloud cloud = null;
            while((line = reader.readLine()) != null){
//                System.out.println(line);
                if (line.startsWith("#") || line.trim().length() == 0){
                    continue;
                }

                if (line.startsWith("[")){
                    if(cloud != null && env != null){
                        clouds.put(env, cloud);
                    }

                    env = line.trim().substring(1, line.length() -1);
                    cloud = new Cloud(env);


                }else{
                    String fields[] = line.trim().split("=");
                    cloud.envConfig.put(fields[0], fields[1]);
                }

            }
            //加进最后一个
            if(cloud != null && env != null){
                clouds.put(env, cloud);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }


    public static void main(String[] args) {
        ConfigLoader loader = new ConfigLoader();
        loader.loadConfig();

        Cloud cloud = loader.getCloud("env6");
        System.out.println(cloud.getConfig("proxy_host"));
    }
}
