<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!DOCTYPE html>
<!--[if lt IE 7 ]><html class="ie ie6" lang="en"> <![endif]-->
<!--[if IE 7 ]><html class="ie ie7" lang="en"> <![endif]-->
<!--[if IE 8 ]><html class="ie ie8" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!--><html lang="en"> <!--<![endif]-->
<head>

    <!-- Basic Page Needs
  ================================================== -->
    <meta charset="utf-8">
    <title>Kalaa</title>
    <meta name="description" content="Free Responsive Html5 Css3 Templates ">
    <meta name="author" content="#">

    <!-- Mobile Specific Metas
	================================================== -->
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

    <!-- CSS
	================================================== -->
    <link rel="stylesheet" href="../../css/zerogrid.css">
    <link rel="stylesheet" href="../../css/style.css">

    <!-- Custom Fonts -->
    <link href="../../font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">


    <link rel="stylesheet" href="../../css/menu.css">
    <script src="../../js/jquery1111.min.js" type="text/javascript"></script>
    <script src="../../js/script.js"></script>

    <!-- Owl Carousel Assets -->
    <link href="../../owl-carousel/owl.carousel.css" rel="stylesheet">
    <!-- <link href="owl-carousel/owl.theme.css" rel="stylesheet"> -->

    <!--[if lt IE 8]>
    <div style=' clear: both; text-align:center; position: relative;'>
        <a href="http://windows.microsoft.com/en-US/internet-explorer/Items/ie/home?ocid=ie6_countdown_bannercode">
            <img src="http://storage.ie6countdown.com/assets/100/images/banners/warning_bar_0000_us.jpg" border="0"
                 height="42" width="820"
                 alt="You are using an outdated browser. For a faster, safer browsing experience, upgrade for free today."/>
        </a>
    </div>
    <![endif]-->
    <!--[if lt IE 9]>
    <script src="js/html5.js"></script>
    <script src="js/css3-mediaqueries.js"></script>
    <![endif]-->

    <link rel="stylesheet" href="/editormd/css/editormd.min.css"/>
    <script src="/editormd/jquery.min.js"></script>
    <script src="/editormd/editormd.min.js"></script>

    <% String contextPath = request.getContextPath();%>

</head>

<body>
<div class="wrap-body">
    <div id='cssmenu' class="align-center">
        <ul>
            <li><a href='/'><span>Home</span></a></li>
            <li><a href='/blog'><span>Blog</span></a></li>
            <li class="active"><a href='/writing'><span>Writing</span></a></li>
            <li class='last'><a href='/contact'><span>Contacts</span></a></li>
        </ul>
    </div>
    <header class="">
        <div class="logo">
            <a href="#"><img src="<%=contextPath%>/images/logo.png"/></a>
        </div>
    </header>
    <!--////////////////////////////////////Container-->
    <section id="container">
        <div class="wrap-container">
            <!-----------------Content-Box-------------------->
            <article class="post zerogrid">
                <div class="row wrap-post"><!--Start Box-->
                    <div class="entry-header">
                        <h2 class="entry-title"><a href="#">BLOG WRITING: SEIZE THE OPPORTUNITY</a></h2>
                        <span class="cat-links"><a href="#">RECORDING</a>, <a href="#">LIFESTYLE</a></span>
                    </div>
                    <form action="/articleController/writing" method="post">
<%--                        <table>
                            <tr>
                                <td>标题:</td>
                                <td><input type="text" name="title"></td>
                            </tr>
                            <tr>
                                <td>作者:</td>
                                <td><input type="text" name="author"></td>
                            </tr>
                            <tr>
                                <td>简介:</td>
                                <td><input type="text" name="description"></td>
                            </tr>
                        </table>--%>
                        <span>标题:</span><input type="text" name="title">
                        <span>作者:</span><input type="text" name="author">
                        <span>简介:</span><input type="text" name="description">
                        <div class="entry-content">
                            <div class="editormd" id="content-editor">
                                <textarea class="editormd-markdown-textarea"
                                          name="content-editor-markdown-doc"></textarea>
                                <textarea class="editormd-html-textarea" name="content"></textarea>
                            </div>
                        </div>
                        <div><input type="submit" value="写好啦" align="right">
                        </div>
                    </form>
                </div>
            </article>
        </div>
    </section>
    <!--////////////////////////////////////Footer-->
    <footer>
        <div class="zerogrid wrap-footer">
            <div class="row">
                <div class="col-1-3 col-footer-1">
                    <div class="wrap-col">
                        <h3>About</h3>
                        <a href="index.jsp"><img src="<%=contextPath%>/images/avatar.jpg"/></a>
                        <p>Ut volutpat consectetur aliquam. Curabitur auctor in nis ulum ornare. Sed consequat, augue
                            condimentum fermentum gravida, metus elit vehicula dui.</p>
                    </div>
                </div>
                <div class="col-1-3 col-footer-2">
                    <div class="wrap-col">
                        <h3>Categories</h3>
                        <ul>
                            <li><a href="#">Action</a></li>
                            <li><a href="#">Romantic</a></li>
                            <li><a href="#">Cartoon</a></li>
                            <li><a href="#">Zombies</a></li>
                        </ul>
                    </div>
                </div>
                <div class="col-1-3 col-footer-3">
                    <div class="wrap-col">
                        <h3>Location</h3>
                        <div class="wrap-map">
                            <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3164.289259162295!2d-120.7989351!3d37.5246781!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x8091042b3386acd7%3A0x3b4a4cedc60363dd!2sMain+St%2C+Denair%2C+CA+95316%2C+Hoa+K%E1%BB%B3!5e0!3m2!1svi!2s!4v1434016649434"
                                    width="100%" height="200" frameborder="0" style="border:0"></iframe>
                        </div>
                    </div>
                </div>

            </div>
        </div>
        <div class="zerogrid copyright">
            <div class="wrapper">
                Copyright @ - More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> -
                Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a>
                <ul class="quick-link f-right">
                    <li><a href="#">Privacy Policy</a></li>
                    <li><a href="#">Terms of Use</a></li>
                </ul>
            </div>
        </div>
    </footer>
    <!-- carousel -->
    <script src="owl-carousel/owl.carousel.js"></script>
    <script>
        $(document).ready(function () {
            $("#owl-slide").owlCarousel({
                autoPlay: 3000,
                items: 2,
                itemsDesktop: [1199, 2],
                itemsDesktopSmall: [979, 1],
                itemsTablet: [768, 1],
                itemsMobile: [479, 1],
                navigation: true,
                navigationText: ['<i class="fa fa-chevron-left fa-5x"></i>', '<i class="fa fa-chevron-right fa-5x"></i>'],
                pagination: false
            });
        });
    </script>

    <script type="text/javascript">
        $(function () {
            editormd("content-editor", { // 和上面的名字保持一致
                width: "100%",
                height: 750,
                syncScrolling: "single",
                path: "/editormd/lib/",// 项目中lib的目录
                saveHTMLToTextarea: true,// 影响后端是否能取到文档中的值


                /** upload picture file configuration **/
                imageUpload: true, // 开启上传功能
                imageFormats: ["jpg", "jpeg", "gif", "png", "bmp", "webp"], // 接收的格式
                imageUploadURL: "/uploadController/picUpload"// 匹配到后端的请求地址，比如用Springmvc的controller接收
                //editor.md期望得到一个json格式的上传后的返回值，格式是这样的：
                /*{
                    success : 0 | 1,           // 0 表示上传失败，1 表示上传成功
                    message : "提示的信息，上传成功或上传失败及错误信息等。",
                    url     : "图片地址"        // 上传成功时才返回
                }*/


            });
        });
    </script>

</div>
</body>
</html>