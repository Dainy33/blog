package blog.utils;

import blog.model.User;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class DainyConfigLoader {
    public Map<String, String> Loader(String path) throws IOException {
        String line = null;
        Map<String, String> map = new HashMap<String, String>();
        InputStream is = this.getClass().getClassLoader().getResourceAsStream(path);
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        while ((line = reader.readLine()) != null) {
            int index = line.indexOf("=");
            String key = line.substring(0, index);
            String value = line.substring(index + 1);
            map.put(key, value);
        }
        return map;
    }

    public Object Loader(String path, Class clazz) throws IOException, IllegalAccessException, InstantiationException {
        String line = null;
        Object o = clazz.newInstance();
        //You should use getDeclaredFields to get the Class's  own fields,rather than
        Field[] fields = clazz.getDeclaredFields();
        Map<String, String> map = new HashMap<String, String>();
        InputStream is = this.getClass().getClassLoader().getResourceAsStream(path);
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        while ((line = reader.readLine()) != null) {
            int index = line.indexOf("=");
            String key = line.substring(0, index);
            String value = line.substring(index + 1);
            map.put(key, value);
        }

        for (Field field : fields) {
            field.setAccessible(true);
            field.set(o,map.get(field.getName()));
        }

        return o;
    }

    @Test
    public void load1() throws IOException {
        String path = "loader.properties";
        Map<String, String> loader = Loader(path);
    }

    @Test
    public void load2() throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        String path = "loader.properties";
        User user = (User)Loader(path, Class.forName("blog.model.User"));
        System.out.println("");
    }
}
/**
 * @program: blog
 * @description:
 * @author: Dainy33
 * @create: 2019-01-18 15:20
 **/
