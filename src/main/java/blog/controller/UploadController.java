package blog.controller;

import com.alibaba.fastjson.JSONObject;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.UUID;

@Controller
@RequestMapping(value = "upload")
public class UploadController {

    private static final Logger logger = Logger.getLogger(UploadController.class);

    @RequestMapping(value = "/picUpload", method = RequestMethod.POST)
    @ResponseBody
    public String picUpload(HttpServletRequest request, HttpServletResponse response, @RequestParam(value = "editormd-image-file", required = false) MultipartFile picFile) {
        PropertyConfigurator.configure(ClassLoader.getSystemResource("resources/log4j.properties"));
        try{
            request.setCharacterEncoding("UTF-8");
            response.setHeader("Content-Type", "text/html");
            String rootPath = request.getSession().getServletContext().getRealPath("");
            String URIpath = "";
            String contextPath = request.getContextPath();
            if(!picFile.isEmpty()){
                String uuid = UUID.randomUUID().toString().replaceAll("-","");
                String contentType = picFile.getContentType();
                String imgType = contentType.substring(contentType.indexOf("/")+1);
                URIpath = "/images/upload/" + uuid + "." + imgType;
                picFile.transferTo(new File(rootPath + URIpath));
            }
            JSONObject json = new JSONObject();
            json.put("success", 1);
            json.put("message", "upload succeed！");
            json.put("url", contextPath + URIpath);
            return json.toJSONString();
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage()+new Date()+"失败");
            JSONObject json = new JSONObject();
            json.put("success", 0);
            return json.toJSONString();
        }
    }
}
/**
 * @program: blog
 * @description:
 * @author: Dainy33
 * @create: 2018-10-16 11:40
 **/
