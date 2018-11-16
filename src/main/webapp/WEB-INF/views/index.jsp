<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!DOCTYPE html>
<!--[if lt IE 7 ]><html class="ie ie6" lang="en"> <![endif]-->
<!--[if IE 7 ]><html class="ie ie7" lang="en"> <![endif]-->
<!--[if IE 8 ]><html class="ie ie8" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!-->
<html lang="en"> <!--<![endif]-->
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


</head>

<body>
<div class="wrap-body">
    <div id='cssmenu' class="align-center">
        <ul>
            <li class="active"><a href='<%=contextPath%>/'><span>Home</span></a></li>
                <li><a href='<%=contextPath%>/blog'><span>Blog</span></a></li>
            <li><a href='<%=contextPath%>/writing'><span>Write</span></a></li>
            <li class='last'><a href='<%=contextPath%>/contact'><span>Contacts</span></a></li>
        </ul>
    </div>
    <header class="">
        <div class="logo">
            <a href="#"><img src="<%=contextPath%>/images/blog/logo.png"/></a>
        </div>
        <div id="owl-slide" class="owl-carousel">
            <div class="item">
                <img src="<%=contextPath%>/images/blog/slider-1.jpg"/>
                <div class="carousel-caption">
                    <div class="carousel-caption-inner">
                        <p class="carousel-caption-title"><a href="#">Why It’s Important To Struggle</a></p>
                        <p class="carousel-caption-category"><a href="#" rel="category tag">Business</a>,
                            <a href="#" rel="category tag">Lifestyle</a>, <a href="#" rel="category tag">Pursuits</a>
                        </p>
                    </div>
                </div>
            </div>
            <div class="item">
                <img src="<%=contextPath%>/images/blog/slider-2.jpg"/>
                <div class="carousel-caption">
                    <div class="carousel-caption-inner">
                        <p class="carousel-caption-title"><a href="#">Why It’s Important To Struggle</a></p>
                        <p class="carousel-caption-category"><a href="#" rel="category tag">Business</a>,
                            <a href="#" rel="category tag">Lifestyle</a>, <a href="#" rel="category tag">Pursuits</a>
                        </p>
                    </div>
                </div>
            </div>
            <div class="item">
                <img src="<%=contextPath%>/images/blog/slider-3.jpg"/>
                <div class="carousel-caption">
                    <div class="carousel-caption-inner">
                        <p class="carousel-caption-title"><a href="#">Why It’s Important To Struggle</a></p>
                        <p class="carousel-caption-category"><a href="#" rel="category tag">Business</a>,
                            <a href="#" rel="category tag">Lifestyle</a>, <a href="#" rel="category tag">Pursuits</a>
                        </p>
                    </div>
                </div>
            </div>
            <div class="item">
                <img src="<%=contextPath%>/images/blog/slider-4.jpg"/>
                <div class="carousel-caption">
                    <div class="carousel-caption-inner">
                        <p class="carousel-caption-title"><a href="#">Why It’s Important To Struggle</a></p>
                        <p class="carousel-caption-category"><a href="#" rel="category tag">Business</a>,
                            <a href="#" rel="category tag">Lifestyle</a>, <a href="#" rel="category tag">Pursuits</a>
                        </p>
                    </div>
                </div>
            </div>
            <div class="item">
                <img src="<%=contextPath%>/images/blog/slider-5.jpg"/>
                <div class="carousel-caption">
                    <div class="carousel-caption-inner">
                        <p class="carousel-caption-title"><a href="#">Why It’s Important To Struggle</a></p>
                        <p class="carousel-caption-category"><a href="#" rel="category tag">Business</a>,
                            <a href="#" rel="category tag">Lifestyle</a>, <a href="#" rel="category tag">Pursuits</a>
                        </p>
                    </div>
                </div>
            </div>
            <div class="item">
                <img src="<%=contextPath%>/images/blog/slider-6.jpg"/>
                <div class="carousel-caption">
                    <div class="carousel-caption-inner">
                        <p class="carousel-caption-title"><a href="#">Why It’s Important To Struggle</a></p>
                        <p class="carousel-caption-category"><a href="#" rel="category tag">Business</a>,
                            <a href="#" rel="category tag">Lifestyle</a>, <a href="#" rel="category tag">Pursuits</a>
                        </p>
                    </div>
                </div>
            </div>
        </div>
    </header>
    <div class="copyrights">Collect from <a href="http://www.cssmoban.com/">企业网站模板</a></div>
    <!--////////////////////////////////////Container-->
    <section id="container">
        <div class="wrap-container">
            <!-----------------Content-Box-------------------->
            <article class="post zerogrid">
                <div class="row wrap-post"><!--Start Box-->
                    <div class="entry-header">
                        <span class="time">June 8, 2016</span>
                        <h2 class="entry-title"><a href="#">RETRO GALLERY: FRAGMENTING PERSISTENT FLIGHT AND
                            PATHOLOGY</a></h2>
                        <span class="cat-links"><a href="#">BUSINESS</a>, <a href="#">LIFESTYLE</a></span>
                    </div>
                    <div class="post-thumbnail-wrap">
                        <img src="<%=contextPath%>/images/blog/1.jpg">
                    </div>
                    <div class="entry-content">
                        <p>Tenent mordicus. Et nemo nimium beatus est; Quorum altera prosunt, nocent altera. Sequitur
                            disserendi ratio cognitioque naturae; Quod si ita se habeat, non possit beatam praestare
                            vitam sapientia. Quamvis enim depravatae non sint, pravae tamen esse possunt. Nec vero alia
                            sunt quaerenda contra Carneadeam illam sententiam. Scientiam pollicentur, quam non erat
                            mirum sapientiae cupido patria esse cariorem. Pudebit te, inquam, illius tabulae, quam
                            Cleanthes sane commode verbis depingere solebat. Ex eorum enim scriptis et institutis cum
                            omnis doctrina liberalis, omnis historia. Duo Reges: constructio interrete….</p>
                        <a href="writing.jsp">More Details</a>
                    </div>
                </div>
            </article>
            <!-----------------Content-Box-------------------->
            <article class="post zerogrid">
                <div class="row wrap-post"><!--Start Box-->
                    <div class="entry-header">
                        <span class="time">June 8, 2016</span>
                        <h2 class="entry-title"><a href="#">RETRO GALLERY: FRAGMENTING PERSISTENT FLIGHT AND
                            PATHOLOGY</a></h2>
                        <span class="cat-links"><a href="#">BUSINESS</a>, <a href="#">LIFESTYLE</a></span>
                    </div>
                    <div class="post-thumbnail-wrap">
                        <img src="<%=contextPath%>/images/blog/2.jpg">
                    </div>
                    <div class="entry-content">
                        <p>Tenent mordicus. Et nemo nimium beatus est; Quorum altera prosunt, nocent altera. Sequitur
                            disserendi ratio cognitioque naturae; Quod si ita se habeat, non possit beatam praestare
                            vitam sapientia. Quamvis enim depravatae non sint, pravae tamen esse possunt. Nec vero alia
                            sunt quaerenda contra Carneadeam illam sententiam. Scientiam pollicentur, quam non erat
                            mirum sapientiae cupido patria esse cariorem. Pudebit te, inquam, illius tabulae, quam
                            Cleanthes sane commode verbis depingere solebat. Ex eorum enim scriptis et institutis cum
                            omnis doctrina liberalis, omnis historia. Duo Reges: constructio interrete….</p>
                        <a href="writing.jsp">More Details</a>
                    </div>
                </div>
            </article>
            <!-----------------Content-Box-------------------->
            <article class="post zerogrid">
                <div class="row wrap-post"><!--Start Box-->
                    <div class="entry-header">
                        <span class="time">June 8, 2016</span>
                        <h2 class="entry-title"><a href="#">RETRO GALLERY: FRAGMENTING PERSISTENT FLIGHT AND
                            PATHOLOGY</a></h2>
                        <span class="cat-links"><a href="#">BUSINESS</a>, <a href="#">LIFESTYLE</a></span>
                    </div>
                    <div class="post-thumbnail-wrap">
                        <img src="<%=contextPath%>/images/blog/3.jpg">
                    </div>
                    <div class="entry-content">
                        <p>Tenent mordicus. Et nemo nimium beatus est; Quorum altera prosunt, nocent altera. Sequitur
                            disserendi ratio cognitioque naturae; Quod si ita se habeat, non possit beatam praestare
                            vitam sapientia. Quamvis enim depravatae non sint, pravae tamen esse possunt. Nec vero alia
                            sunt quaerenda contra Carneadeam illam sententiam. Scientiam pollicentur, quam non erat
                            mirum sapientiae cupido patria esse cariorem. Pudebit te, inquam, illius tabulae, quam
                            Cleanthes sane commode verbis depingere solebat. Ex eorum enim scriptis et institutis cum
                            omnis doctrina liberalis, omnis historia. Duo Reges: constructio interrete….</p>
                        <a href="writing.jsp">More Details</a>
                    </div>
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
                        <a href="index.jsp"><img src="<%=contextPath%>/images/blog/avatar.jpg"/></a>
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
                        <div class="wrap-map"></div>
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