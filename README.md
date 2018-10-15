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