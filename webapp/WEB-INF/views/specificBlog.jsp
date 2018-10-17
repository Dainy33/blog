<%@ page import="java.util.Date" %>
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

    <% String contextPath = request.getContextPath();%>

    <% String Id = request.getParameter("infoId");%>

    <script>
        function articleInfo() {
            var infoId = "<%= Id%>";
            $.ajax({
                url: "/article/getArticleInfoByInfoId?infoId=" + infoId.toString(),
                type: 'GET',
                data: {},
                dataType: "json",
                success: function (response) {
                    var obj = response;
                    $.each(obj, function (index, element) {
                        $(".time").html(element.createDate);
                        $(".entry-title").html(element.title);
                    })
                },
                error: function (response) {
                }
            });

            articleContent();
            articleComment()
        }

        function articleContent() {
            var infoId = "<%= Id%>";
            $.ajax({
                url: "<%=contextPath%>/article/getArticleContentByInfoId?infoId=" + infoId.toString(),
                type: 'GET',
                data: {},
                dataType: "json",
                success: function (response) {
                    var obj = response;
                    $.each(obj, function (index, element) {
                        $("#Acontent").html(element.content);
                    })
                },
                error: function (response) {
                }
            });
        }

        function articleComment() {
            var infoId = "<%= Id%>";
            $.ajax({
                url: "<%=contextPath%>/article/getArticleCommentByInfoId?infoId=" + infoId.toString(),
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
                        $("#Acomment").append(html);
                    })
                },
                error: function (response) {
                }
            });
        }

        $(document).ready(articleInfo());


    </script>
</head>

<body>
<div class="wrap-body">
    <div id='cssmenu' class="align-center">
        <ul>
            <li><a href='<%=contextPath%>/'><span>Home</span></a></li>
            <li class="active   "><a href='<%=contextPath%>/blog'><span>Blog</span></a></li>

            <li><a href='<%=contextPath%>/writing'><span>Writing</span></a></li>
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
                        <span class="time">CREATEDATE</span>
                        <h2 class="entry-title">BLOG TITLE</h2>
                    </div>
                    <div class="entry-content" id="Acontent">
                        <%--ArticleContent--%>
                    </div>
                </div>
            </article>

            <article class="post zerogrid">
                <div class="row wrap-post"><!--Start Box-->
                    <div class="entry-content" id="Acomment">
                        <div>
                            <br><h1 align="center" style="font-family: 'Cabin', Helvetica, sans-serif;font-size: 24px;line-height: 30px;color: #575756 ;letter-spacing: 2px;font-weight: 600;margin: 0 ">留言</h1><br>
                        </div>
                        <%--ArticleComment--%>
                    </div>
                </div>
            </article>

            <div class="zerogrid">
                <div class="comments-are">
                    <div id="comment">
                        <h3>Leave a Reply</h3>
                        <span>Your email address will not be published. Required fields are marked </span>
                        <form name="form1" id="comment_form" method="post" action="<%=contextPath%>/article/createArticleComment">
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
                            <label>
                                <input type="hidden" name="infoId" value="<%=Id%>" >
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