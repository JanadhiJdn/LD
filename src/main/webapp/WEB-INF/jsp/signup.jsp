<%-- 
    Document   : signup
    Created on : Feb 16, 2017, 10:02:03 PM
    Author     : Janadhi Nanayakkara
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="Dashboard">
        <meta name="keyword" content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">

        <title>Sign Up | Lawyer Diary</title>

        <!-- Bootstrap core CSS -->
        <link rel="stylesheet" href="<c:url value='/assets/css/bootstrap.css'/>" >
        <!--external css-->
        <link href="<c:url value='/assets/font-awesome/css/font-awesome.css'/>" rel="stylesheet" />

        <!-- Custom styles for this template -->
        <link href="<c:url value='/assets/css/style.css'/>" rel="stylesheet">
        <link href="<c:url value='/assets/css/style-responsive.css'/>" rel="stylesheet">

        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
          <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>

    <body>

        <!-- **********************************************************************************************************************************************************
              TOP BAR CONTENT & NOTIFICATIONS
             *********************************************************************************************************************************************************** -->
        <!--header start-->
        <header class="header black-bg">          
            <!--logo start-->           
            <a class="logo"><b style="font-size: 30px;"><img src="<c:url value='/assets/img/logo.png'/>" class="img-circle" width="60"/>&nbsp&nbspLAWYER DIARY</b></a>
            <!--logo end-->       
            <div class="top-menu">
                <ul class="nav pull-right top-menu">
                    <li><a class="logout" href="<c:url value='/login.html'/>">Login</a></li>
                </ul>
                <ul class="nav pull-right top-menu">
                    <li><a class="logout" href="<c:url value='/signup.html'/>">Sign Up</a></li>
                </ul>
            </div>
        </header>
        <!--header end-->
        <!-- **********************************************************************************************************************************************************
        MAIN CONTENT
        *********************************************************************************************************************************************************** -->

        <div id="login-page">
            <div class="container">
                <form id="addLawyer" class="form-login" data-toggle="validator" action="${pageContext.servletContext.contextPath}/lawyer/add" method="POST">
                    <h2 class="form-login-heading">SIGN UP</h2>
                    <div class="login-wrap">
                        <div class="form-group">
                            <input type="text" class="form-control mask-name" id="first_name" name="first_name" placeholder="First Name" autofocus required>	            		
                            <div class="help-block with-errors"></div>  
                        </div>    
                        <div class="form-group">        
                            <input type="text" class="form-control mask-name" id="last_name" name="last_name" placeholder="Last Name" required>
                            <div class="help-block with-errors"></div>  
                        </div>	
                        <div class="form-group">	            	            
                            <input type="text" class="form-control mask-mobile" id="mobile" name="mobile" placeholder="Mobile Number" required>	            	            
                            <div class="help-block with-errors"></div>  
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-control" id="user_name" name="user_name" placeholder="User Name" required>	            
                            <div class="help-block with-errors"></div>  
                        </div>
                        <div class="form-group">
                            <input type="password" class="form-control" id="pw" name="pw" placeholder="Password" required>	           			           	
                            <div class="help-block with-errors"></div>  
                        </div>
                        <div class="form-group">
                            <input type="password" class="form-control" id="confirm_pw" name="confirm_pw" placeholder="Comfirm Password" required  data-match="#pw" data-match-error="Please enter the same password as above">    
                            <div class="help-block with-errors"></div>       	
                        </div>
                        <button class="btn btn-theme btn-block btn-primary disabled" href="index.html" type="submit"><i class="fa fa-lock"></i> SIGN UP</button>
                        <hr>		            		            
                        <div class="registration">
                            Already have an account?<br/>
                            <a class="" href="login.html">
                                Login                               
                            </a>
                        </div>		
                    </div>			
                </form>	  	
            </div>
        </div>

        <!-- js placed at the end of the document so the pages load faster -->
        <script src="<c:url value='/assets/js/jquery.js'/>"></script>
        <script src="<c:url value='/assets/js/bootstrap.min.js'/>"></script>
        <script src="<c:url value='/assets/js/validator.min.js'/>"></script>
        <script src="<c:url value='/assets/js/jquery.mask.min.js'/>"></script>
        <!--BACKSTRETCH-->
        <!-- You can use an image of whatever size. This script will stretch to fit in any screen size.-->
        <script type="text/javascript" src="<c:url value='/assets/js/jquery.backstretch.min.js'/>"></script>
        <script>
            $.backstretch("assets/img/login-bg.jpg", {speed: 500});
        </script>

        <!-- custom -->
        <script type="text/javascript">
            $(document).ready(function () {
                $('.mask-mobile').mask('000-0000000');                
                $('.mask-name').mask('SSSSSSSSSSSSSSSSSSSS');
            });
        </script>
        <!-- end: Javascript -->

    </body>
</html>
