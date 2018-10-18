package ArticleTest;

import blog.model.ArticleInfo;
import blog.service.IArticleService;
import org.junit.Test;

import javax.annotation.Resource;

public class jUnitTest {
    public class person{
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
    public void souts(){
        person example = new person();
        example.setLeftEyeSight("5.0");
        example.setRightEyeSight("4.5");
        String str="<a href=\"<%=contextPath%>/specificBlog?infoId=\" + element.articleInfoId>";
    }




}
/**
 * @program: blog
 * @description:
 * @author: Dainy33
 * @create: 2018-10-10 14:18
 **/
