<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!DOCTYPE html>
<!--[if lt IE 7 ]><html class="ie ie6" lang="en"> <![endif]-->
<!--[if IE 7 ]><html class="ie ie7" lang="en"> <![endif]-->
<!--[if IE 8 ]><html class="ie ie8" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!--><html lang="en"> <!--<![endif]-->
<head>

    <% String contextPath = request.getContextPath();%>

    <!-- Basic Page Needs
  ================================================== -->
    <meta charset="utf-8">
    <title>Kalaa</title>
    <meta name="description" content="Dainy">
    <meta name="author" content="#">

    <!-- Mobile Specific Metas
	================================================== -->
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

    <!-- CSS
	================================================== -->
    <link rel="stylesheet" href="<%=contextPath%>/css/blog/zerogrid.css">
    <link rel="stylesheet" href="<%=contextPath%>/css/blog/style.css">

    <!-- Custom Fonts -->
    <link href="<%=contextPath%>/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">


    <link rel="stylesheet" href="<%=contextPath%>/css/blog/menu.css">
    <script src="<%=contextPath%>/js/blog/jquery1111.min.js" type="text/javascript"></script>
    <script src="<%=contextPath%>/js/blog/script.js"></script>

    <!-- Owl Carousel Assets -->
    <link href="<%=contextPath%>/owl-carousel/owl.carousel.css" rel="stylesheet">
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


    <script>
        function getLatestTenArticleInfo() {

            var pageSize = 10;

            $.ajax({
                url: "<%=contextPath%>/article/getLatestTenArticleInfo",
                type: 'GET',
                data: {},
                dataType: "json",
                success: function (response) {
                    var obj = response;
                    $.each(obj, function (index, element) {
                        var html = ["<li>",
                            "<div>",
                            "<h2>",
                            "<a href='<%=contextPath%>/specificBlog?infoId=" + element.articleInfoId + "'>",
                            element.title,
                            "</a>",
                            "</h2>",
                            "<h4 align='right'>",
                            element.author,
                            "</h4>",
                            "<p>",
                            element.description,
                            "</p>",
                            "</div>",
                            "</li>",
                            "<br>"].join('\n');
                        $("#articleInfoDiv").append(html);
                    })
                },
                error: function (response) {

                }
            });
            getBlogComment();
        }

        function getBlogComment() {
            $.ajax({
                url: "<%=contextPath%>/article/getBlogComment",
                type: 'GET',
                data: {},
                dataType: "json",
                success: function (response) {
                    var obj = response;
                    $.each(obj, function (index, element) {
                        var html = ["<li>",
                            "<div class='divcss5'>",
                            "<h2>",
                            element.name,
                            "</a>",
                            "</h2>",
                            "<h4 align='right'>",
                            element.email,
                            "</h4>",
                            "<p>",
                            element.comment,
                            "</p>",
                            "</div>",
                            "</li>",
                            "<br>"].join('\n');
                        $("#Bcomment").append(html);
                    })
                },
                error: function (response) {
                }
            });
        }

        $(document).ready(getLatestTenArticleInfo());


    </script>

</head>

<body>
<div class="wrap-body">
    <div id='cssmenu' class="align-center">
        <ul>
            <li><a href='<%=contextPath%>/'><span>Home</span></a></li>
            <li class="active   "><a href='<%=contextPath%>/blog'><span>Blog</span></a></li>
            <li><a href='<%=contextPath%>/login'><span>Log And Write</span></a></li>
            <li class='last'><a href='<%=contextPath%>/contact'><span>Contacts</span></a></li>
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
                        <span class="time">June 8, 2016</span>
                        <h2 class="entry-title"><a href="#">BLOG GALLERY</a></h2>
                        <span class="cat-links"><a href="#">STUDY</a>, <a href="#">LIFESTYLE</a></span>
                    </div>
                    <div class="post-thumbnail-wrap">
                        <img src="<%=contextPath%>/images/1.jpg">
                    </div>
                    <div class="entry-content">
                        <%--blog展示主页的简介--%>
                        <div class="excerpt">
                            <p>A man is not old as long as he is seeking something. A man is not old until regrets take
                                the place of dreams.
                            </p>
                            <%--引用--%>
                            <blockquote>
                                <p>If you would go up high , then use your own legs ! Do not let yourselves carried
                                    aloft;
                                    do not seat yourselves on other people's backs and heads .(F.W .Nietzsche , German
                                    Philosopher)
                                </p>
                            </blockquote>
                        </div>
                        <%--正文--%>
                        <div id="articleInfoDiv">
                            <br>
                            <h1 align="center"
                                style="font-family: 'Cabin', Helvetica, sans-serif;font-size: 24px;line-height: 30px;color: #575756 ;letter-spacing: 2px;font-weight: 600;margin: 0 ">
                                最新文章
                            </h1>
                            <br>
                        </div>

                        <%--分页插件--%>

                    </div>
                </div>
            </article>

            <article class="post zerogrid">
                <div class="row wrap-post"><!--Start Box-->
                    <div class="entry-content" id="Bcomment">
                        <div>
                            <br>
                            <h1 align="center"
                                style="font-family: 'Cabin', Helvetica, sans-serif;font-size: 24px;line-height: 30px;color: #575756 ;letter-spacing: 2px;font-weight: 600;margin: 0 ">
                                留言</h1><br>
                        </div>
                        <%--BlogComment--%>
                    </div>
                </div>
            </article>

            <div class="zerogrid">
                <div class="comments-are">
                    <div id="comment">
                        <h3>Leave a Reply</h3>
                        <span>Your email address will not be published. Required fields are marked </span>
                        <form name="form1" id="comment_form" method="post"
                              action="<%=contextPath%>/article/createBlogComment">
                            <label>
                                <span>Comment:</span>
                                <textarea name="message" id="message"></textarea>
                            </label>
                            <label>
                                <span>Name:</span>
                                <input type="text" name="name" id="name" required>
                            </label>
                            <label>
                                <span>Email:</span>
                                <input type="email" name="email" id="email" required>
                            </label>
                            <center><input class="sendButton" type="submit" name="Submit" value="Submit"></center>
                        </form>
                    </div>
                </div>
            </div>
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
                        <p>To see a world in a grain of sand. And a heaven in a wild flower
                            Hold infinity in the palm of your hand. And eternity in an hour.</p>
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
                Copyright @ - More Information <a href="#" target="_blank" title="Dainy">Dainy</a> -
                Collect from <a href="#" title="Dainy" target="_blank">Dainy</a>
                <ul class="quick-link f-right">
                    <li><a href="#">Privacy Policy</a></li>
                    <li><a href="#">Terms of Use</a></li>
                </ul>
            </div>
        </div>
    </footer>
    <!-- carousel -->
    <script src="<%=contextPath%>/owl-carousel/owl.carousel.js"></script>
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
</div>
</body>
</html>