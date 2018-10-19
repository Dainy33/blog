package ArticleTest;

import blog.model.ArticleInfo;
import blog.service.IArticleService;
import org.junit.Test;

import javax.annotation.Resource;
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


        String s = String.valueOf(new Date().getTime());
        System.out.println(s);

        Date date =new Date();
        date.setTime(new Long(s));
        System.out.println(date);
    }


}
/**
 * @program: blog
 * @description:
 * @author: Dainy33
 * @create: 2018-10-10 14:18
 **/
