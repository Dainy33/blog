package ArticleTest;

import blog.model.ArticleInfo;
import blog.service.IArticleService;
import com.alibaba.fastjson.JSONPath;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class jUnitTest {
    public class person {
        private String leftEyeSight;
        private String rightEyeSight;

        public person() {
        }

        public person(String leftEyeSight, String rightEyeSight) {
            this.leftEyeSight = leftEyeSight;
            this.rightEyeSight = rightEyeSight;
        }

        public String getLeftEyeSight() {
            return leftEyeSight;
        }

        public void setLeftEyeSight(String leftEyeSight) {
            this.leftEyeSight = leftEyeSight;
        }

        public String getRightEyeSight() {
            return rightEyeSight;
        }

        public void setRightEyeSight(String rightEyeSight) {
            this.rightEyeSight = rightEyeSight;
        }
    }


    @Test()
    public void cook(){
        Cookie cookie = new Cookie("Name","Pancake");
    }


    @Test
    public void itest(){
        String[] strings= {"111","222","333","444"};
        for (String s:strings){
            if(s.equals("333")){
                break;
            }
            System.out.println(s);
        }
        for(String s:strings){
            System.out.println(s);
        }
    }

    @Test
    public void jpTest(){
        String sessionInfo ="{\"accountStructure\":\"2\",\"aliyunID\":\"aliyuntest\",\"aliyunPK\":\"999999999\",\"bid\":false,\"createTime\":1412870400000,\"createUser\":\"26842\",\"expired\":false,\"isMfaChecked\":\"false\",\"partnerPk\":\"26842\",\"role\":\"user\",\"status\":0,\"updateTime\":1412870400000}";
        Object read = JSONPath.read(sessionInfo, "$.aliyunPK");
        System.out.println(read);
    }

    @Test
    public void souts() throws ParseException {
/*        Date date = new Date();
        System.out.println(date);
        Long stamp =new Date().getTime();
        System.out.println(stamp);
        String str = String.valueOf(stamp);
        System.out.println(str);*/

/*        int a =(int) (System.currentTimeMillis() / 1000);
        String s = String.valueOf(a);
        System.out.println(s);*/

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", java.util.Locale.US);

/*        date.setTime(stamp);

        System.out.println(date);*/

/*
        String s = String.valueOf(new Date().getTime());
        System.out.println(s);

        Date date =new Date();
        date.setTime(new Long(s));
        System.out.println(date);*/

        StringBuilder sb = new StringBuilder();
        sb.append("abcdefghij");
        System.out.println(sb.length());

        //System.out.println(System.getenv("TERM"));
    }


}
/**
 * @program: blog
 * @description:
 * @author: Dainy33
 * @create: 2018-10-10 14:18
 **/
