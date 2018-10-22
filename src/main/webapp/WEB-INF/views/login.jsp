<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!DOCTYPE html>
<!--[if lt IE 7]> <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]> <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]> <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!-->
<html class="no-js"> <!--<![endif]-->
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Sign in</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">


    <!-- Facebook and Twitter integration -->
    <meta property="og:title" content=""/>
    <meta property="og:image" content=""/>
    <meta property="og:url" content=""/>
    <meta property="og:site_name" content=""/>
    <meta property="og:description" content=""/>
    <meta name="twitter:title" content=""/>
    <meta name="twitter:image" content=""/>
    <meta name="twitter:url" content=""/>
    <meta name="twitter:card" content=""/>

    <% String contextPath = request.getContextPath();%>


    <!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
    <link rel="shortcut icon" href="favicon.ico">

    <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,700,300' rel='stylesheet' type='text/css'>

    <link rel="stylesheet" href="<%=contextPath%>/css/login/bootstrap.min.css">
    <link rel="stylesheet" href="<%=contextPath%>/css/login/animate.css">
    <link rel="stylesheet" href="<%=contextPath%>/css/login/style.css">


    <!-- Modernizr JS -->
    <script src="<%=contextPath%>/js/login/modernizr-2.6.2.min.js"></script>
    <!-- FOR IE9 below -->
    <!--[if lt IE 9]>
    <script src="js/login/respond.min.js"></script>
    <![endif]-->

</head>
<body>

<div class="container">
    <div class="copyrights">Collect from <a href="#" title="Dainy">Dainy</a></div>
    <div class="row">
        <div class="col-md-4 col-md-offset-4">


            <!-- Start Sign In Form -->
            <form action="<%=contextPath%>/user/login" class="fh5co-form animate-box" data-animate-effect="fadeIn" method="post">
                <h2>Sign In</h2>
                <div class="form-group">
                    <label for="username" class="sr-only">Username</label>
                    <input type="text" class="form-control" id="username" name="username" placeholder="Username" autocomplete="off">
                </div>
                <div class="form-group">
                    <label for="password" class="sr-only">Password</label>
                    <input type="password" class="form-control" id="password" name="password" placeholder="Password" autocomplete="off">
                </div>
                <div class="form-group">
                    <label for="remember"><input type="checkbox" id="remember" name="remember"> Remember Me</label>
                </div>
                <div class="form-group">
                    <p>Not registered? <a href="#">Sign Up</a> | <a href="#">Forgot Password?</a>
                    </p>
                </div>
                <div class="form-group">
                    <input type="submit" value="Sign In" class="btn btn-primary">
                </div>
            </form>
            <!-- END Sign In Form -->

        </div>
    </div>
    <div class="row" style="padding-top: 60px; clear: both;">
        <div class="col-md-12 text-center">
            <p>
                <small>Copyright @ - More Information <a href="#" target="_blank" title="Dainy">Daniy</a> -
                    Collect from <a href="#" title="Dainy" target="_blank">Dainy</a></small>
            </p>
        </div>
    </div>
</div>

<!-- jQuery -->
<script src="<%=contextPath%>/js/login/jquery.min.js"></script>
<!-- Bootstrap -->
<script src="<%=contextPath%>/js/login/bootstrap.min.js"></script>
<!-- Placeholder -->
<script src="<%=contextPath%>/js/login/jquery.placeholder.min.js"></script>
<!-- Waypoints -->
<script src="<%=contextPath%>/js/login/jquery.waypoints.min.js"></script>
<!-- Main JS -->
<script src="<%=contextPath%>/js/login/main.js"></script>


</body>
</html>
