<%-- 
    Document   : login
    Created on : Feb 16, 2017, 10:42:41 PM
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

        <title>Login | Lawyer Diary</title>

        <!-- Bootstrap core CSS -->
        <link href="<c:url value='/assets/css/bootstrap.css'/>" rel="stylesheet">
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

                <form class="form-login" data-toggle="validator" action="${pageContext.servletContext.contextPath}/lawyer/login" method="POST">
                    <h2 class="form-login-heading">LOGIN</h2>
                    <div class="login-wrap">
                        <div class="form-group">
                            <input type="text" class="form-control" name="user_name" id="user_name" placeholder="User Name" autofocus required>	            		           
                            <div class="help-block with-errors"></div>  
                        </div>
                        <div class="form-group">
                            <input type="password" class="form-control" name="pw" id="pw" placeholder="Password" required>
                            <div class="help-block with-errors"></div>  
                        </div>
                        <label class="checkbox">
                            <span class="pull-right">
                                <a data-toggle="modal" href="<c:url value='/login.jsp#myModal'/>"> Forgot Password?</a>		
                            </span>
                        </label>
                        <button class="btn btn-theme btn-block btn-primary disabled" href="<c:url value='/home.html'/>" type="submit"><i class="fa fa-lock"></i> LOG IN</button>
                        
                        <!-- c tag notifications -->
                        <c:if test="${requestScope.$userNotFound != null}">
                            <div>
                                <br>
                                <h4 style="color: red;"><c:out value="Login Failed !!!"/></h4>
                                <h5><c:out value="${$userNotFound}"/></h5>
                            </div>
                        </c:if>
                        <c:if test="${requestScope.$result != null}">
                            <div>
                                <br>
                                <h4 style="color: red;"><c:out value="Login Failed !!!"/></h4>
                                <h5><c:out value="${$result}"/></h5>
                            </div>
                        </c:if>
                        <c:if test="${requestScope.$error != null}">
                            <div>
                                <br>
                                <h4 style="color: red;"><c:out value="Login Failed !!!"/></h4>
                                <h5><c:out value="${$error}"/></h5>
                            </div>
                        </c:if>                        
                        <!-- end c tag notifications -->
                        
                        <hr>		            		            
                        <div class="registration">
                            Don't have an account yet?<br/>
                            <a class="" href="<c:url value='/signup.html'/>">
                                Create an account
                            </a>
                        </div>		
                    </div>

                    <!-- Modal -->
                    <div aria-hidden="true" aria-labelledby="myModalLabel" role="dialog" tabindex="-1" id="myModal" class="modal fade">
                        <div class="modal-dialog">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                    <h4 class="modal-title">Forgot Password ?</h4>
                                </div>
                                <div class="modal-body">
                                    <p>Enter your Phone number to reset your password.</p>
                                    <input type="text" name="mobile" placeholder="Phone number" autocomplete="off" class="form-control placeholder-no-fix">

                                </div>
                                <div class="modal-footer">
                                    <button data-dismiss="modal" class="btn btn-default" type="button">Cancel</button>
                                    <button class="btn btn-theme" type="button">Submit</button>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- modal -->

                </form>	  	

            </div>            
        </div>


        <!-- js placed at the end of the document so the pages load faster -->
        <script src="<c:url value='/assets/js/jquery.js'/>"></script>
        <script src="<c:url value='/assets/js/bootstrap.min.js'/>"></script>
        <script src="<c:url value='/assets/js/validator.min.js'/>"></script>
        <!--BACKSTRETCH-->
        <!-- You can use an image of whatever size. This script will stretch to fit in any screen size.-->
        <script type="text/javascript" src="<c:url value='/assets/js/jquery.backstretch.min.js'/>"></script>
        <script>
            $.backstretch("assets/img/login-bg.jpg", {speed: 500});
        </script>
    </body>
</html>
