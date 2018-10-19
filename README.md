# blog

##version 1.0.0
###description
* SSH框架初始化
* Model Dao Service 初设计
* ApplicationContext配置事务后，需要在service层加@Transactional注解
  Dao层才能访问数据库


##version 1.0.1
###description

* Model 
* * Id由AUTO改为自己赋值UUID 数据库不支持UUID要转为String
* * Info:title，type，author,createDate由jsp封装;Id由UUID生成，并传给Content;
* * Content:content由jsp封装;InfoId由Info提供，ContentId后端生成;


* Service 
* * 添加增删改查操作


* Controller 
* * 添加Test和Article



##version 1.0.2
###description
* 添加UserController
* UserController实现login和register
###Tips
* WEB-INF下的jsp文件不支持超链接(<a href=">)跳转,
  必须经过DispatchServlet
* 另一个页面是html页面，还是jsp页面呢？
  页面在WEB-INF里面，还是外面呢？这个都要分情况讨论的。
  如果是html页面且在WEB-INF外面，可以直接跳转
  如果在WEB-INF里面的页面，就必须通过servlet去跳转了。

* form表单提交有时候明明action存在还会报action404错误，
  原因是因为数据格式不对应的关系，比如图中的manStationId
  传输的是int类型，但是后台comm中的类型不是int类型，导致
  form表单无法提交。
* <form action="userController/login" method="post">
  <form action="/userController/login" method="post">
  action加/不然404

##version web1.0.1
##description
*     <mvc:default-servlet-handler />
加入前端页面后，页面读取不到css  js  images等任何文件
SpringMVC 中 需要配置 对静态资源文件的访问

##version web1.0.2
##description
* 将index single contact已到WEB-INF/views 对页面的访问通过DispatcherServlet
  视图的生成通过Controller
* 增加JsonUtil工具类

##version web1.0.3
##description
* 新增Blog主页和Blog具体页
* 干掉topBar的blog的下拉菜单
* ajax模板
            $.ajax({

                url: "请求地址",

                type: "请求方式",

                data: "请求参数",

                dataType: "服务器返回数据类型",

                success: "服务器处理正常后对应的回调函数",

                error: "服务器出错对应的回调函数"

            });
*  . 对应class
    $(".articleInfoDiv").append("<h4>res.title</h4>");
   # 对应id
   $("#articleInfoDiv").append("<h4>res.title</h4>");
   
   
##version web1.0.4
##description
* Blog.jsp完成
* Specific半成品,不知道参数到底传没传过去

##version web1.0.5
##description
* js是肯定不能直接用<% %>中java代码的变量的
* <% String Id = request.getParameter("infoId");%>
* <scripts>
        var infoId = "<%= Id%>";
  </scripts>

##version web1.0.6
##description
* 加入editormd插件
* 开始编写Writing页面

##version web1.1.0
##description
* 实现了写Info和content
* 页面跳转和绝对路径问题仍存在
* <span><input>不在一行
* 前台到Servlet中文乱码


##version web1.1.1
##description
* comment 写和读大体完成
* 读的布局需要修改
* 上传图片未解决


##version web1.1.2
##description
* comment 增加BlogComment
* Blog/ArticleComment按时间降序返回
* 页面跳转 写完调到blog 写完articleComment调到当前Article 写完BlogComment调到blog

##version web1.1.3
##description
* 将getLatestTenArticle 移到 index (数量10需调整 3个?)
* 在blog页获取全部文章并加入分页
* comment分页
* 评论区加入留言标题


##version web1.1.4
##description
*所有的绝对路径都改为相对路径
*editormd 在writing.jsp 下的配置信息的path也要改成绝对路径
*有一个a href需要转义 里面同时有变量常亮和jsp表达式未解决
* ArticleController return "blog"bug 
其实当时的视图仍然是/article/CreateComment(post)
所以刷新会再次调用
改成重定向
*时间降序排序也有问题 String类型按字典序排序了
* mysql数据库中文问题
sudo vim /etc/mysql/my.cnf
最后面加 
[client]
default-character-set=utf8
[mysqld]
character-set-server=utf8
[mysql]
default-character-set=utf8


##version web1.1.5
* 项目结构重构webapp 迁移到/src/main/
* 在spring-mvc中加入上传用的bean
* pom加了两个支持上传的依赖
* 图片上传仍未解决



