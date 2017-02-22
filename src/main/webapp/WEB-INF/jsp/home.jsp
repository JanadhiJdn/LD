<%-- 
    Document   : home
    Created on : Feb 17, 2017, 7:51:18 PM
    Author     : Janadhi Nanayakkara
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <title>Home | Lawyer Diary</title>

        <!-- Bootstrap core CSS -->
        <link href="<c:url value='/assets/css/bootstrap.css'/>" rel="stylesheet">
        <!--external css-->
        <link href="<c:url value='/assets/font-awesome/css/font-awesome.css'/>" rel="stylesheet" />
        <link href="<c:url value='/assets/js/fullcalendar/bootstrap-fullcalendar.css'/>" rel="stylesheet" />

        <!-- Custom styles for this template -->
        <link href="<c:url value='/assets/css/style.css'/>" rel="stylesheet">
        <link href="<c:url value='/assets/css/style-responsive.css'/>" rel="stylesheet">

        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
          <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
        <style>

            #calendar .fc-header-title h2{
                color: #000000;
            }

        </style>

    </head>

    <body>

        <section id="container" >
            <!-- **********************************************************************************************************************************************************
            TOP BAR CONTENT & NOTIFICATIONS
            *********************************************************************************************************************************************************** -->
            <!--header start-->
            <header class="header black-bg">    
                <div class="sidebar-toggle-box">
                    <div class="fa fa-bars tooltips" data-placement="right" data-original-title="Toggle Navigation"></div>
                </div>          
                <!--logo start-->
                <a class="logo"><b>LAWYER DIARY</b></a>
                <!--logo end-->            
                <div class="top-menu">
                    <ul class="nav pull-right top-menu">
                        <li><a class="logout" href="<c:url value='/login.html'/>">Logout</a></li>
                    </ul>
                </div>            
            </header>
            <!--header end-->

            <!-- **********************************************************************************************************************************************************
            MAIN SIDEBAR MENU
            *********************************************************************************************************************************************************** -->
            <!--sidebar start-->
            <aside>
                <div id="sidebar"  class="nav-collapse ">
                    <!-- sidebar menu start-->
                    <ul class="sidebar-menu" id="nav-accordion">              
                        <p class="centered"><img src="<c:url value='/assets/img/logo.png'/>" class="img-circle" width="60"></a></p>
                        <h5 class="centered" style="color: #a8ee90">${$LoggedLawyer.firstName} ${$LoggedLawyer.lastName}</h5>              	  	                            				
                        <li><a id=menuList href="<c:url value='/home.html'/>"><img src="<c:url value='/assets/img/homeWhite.png'/>" width="25px"/> &nbsp&nbsp&nbspHome</a></li>
                        <li><a id=menuList href="/bootstrap/index.htm"><img src="<c:url value='/assets/img/calendarWhite.png'/>" width="25px"/> &nbsp&nbsp&nbspCalendar</a></li>
                        <li><a id=menuList href="/bootstrap/index.htm"><img src="<c:url value='/assets/img/addWhite.png'/>" width="25px"/>&nbsp&nbsp&nbsp&nbspAdd New Case</a></li>
                        <li><a id=menuList href="/bootstrap/index.htm"><img src="<c:url value='/assets/img/listWhite.png'/>" width="25px">&nbsp&nbsp&nbsp&nbspAll Cases</a></li>
                        <li><a id=menuList href="/bootstrap/index.htm"><img src="<c:url value='/assets/img/searchWhite.png'/>" width="25px">&nbsp&nbsp&nbsp&nbspSearch Case</a></li>
                        <li><a id=menuList href="<c:url value='/addClient.htm'/>"><img src="<c:url value='/assets/img/addClientWhite.png'/>" width="25px">&nbsp&nbsp&nbsp&nbspAdd New Client</a></li>
                    </ul>
                    <!-- sidebar menu end-->
                </div>
            </aside>
            <!--sidebar end-->

            <!-- **********************************************************************************************************************************************************
            MAIN CONTENT
            *********************************************************************************************************************************************************** -->
            <!--main content start-->
            <section id="main-content">
                <section class="wrapper site-min-height">          	            
                    <!-- 
                    ****************************************************************************************************************************************************
                    RIGHT SIDEBAR CONTENT
                    *********************************************************************************************************************************************************-->        
                    <div class="col-lg-9 main-chart">

                        <div class="col-md-4 widget">
                            <div class="stats-left ">
                                <a>
                                    <h5>Running</h5>
                                    <h4>Cases</h4>
                                </a>
                            </div>
                            <div class="stats-right">
                                <label> 45</label>
                            </div>                
                        </div>
                        <div class="col-md-4 widget states-mdl">
                            <a href="">
                                <div class="stats-left">
                                    <h5>All</h5>
                                    <h4>Clients</h4>
                                </div>
                            </a>
                            <div class="stats-right">
                                <label> 80</label>
                            </div>
                            <div class="clearfix"> </div> 
                        </div>
                        <div class="col-md-4 widget states-last">
                            <div class="stats-left">
                                <h5>Today</h5>
                                <h4>Orders</h4>
                            </div>
                            <div class="stats-right">
                                <label>51</label>
                            </div>
                            <div class="clearfix"> </div> 
                        </div>

                        <div class="col-lg-12 mt" style="background-color: #ffffff">                                    
                            <aside class="col-lg-12 mt">
                                <section class="panel">
                                    <div class="panel-body">
                                        <div id="calendar" class="has-toolbar"></div>
                                    </div>
                                </section>
                            </aside>
                        </div>

                    </div>   

                    <div class="col-lg-3 ds" style="background-color: #E4E4E4">

                        <h3>TODAY CASES&nbsp&nbsp<span class="badge bg-theme">4</span></h3>                                        
                        <!-- First Action -->
                        <div class="desc">
                            <div class="thumb">
                                <span class="badge bg-theme"><i class="fa fa-clock-o"></i></span>
                            </div>
                            <div class="details">
                                <p><muted><a href="#">D 398</a></muted><br/>
                                Supreme court,Fort,Galle<br/>
                                Step : Preliminary Hearing 
                                </p>
                            </div>
                        </div>
                        <!-- Second Action -->
                        <div class="desc">
                            <div class="thumb">
                                <span class="badge bg-theme"><i class="fa fa-clock-o"></i></span>
                            </div>
                            <div class="details">
                                <p><muted><a href="#">D 398</a></muted><br/>
                                Magistrate's Court Galle<br/>
                                Step : Preliminary Hearing 
                                </p>
                            </div>
                        </div>
                        <!-- Third Action -->
                        <div class="desc">
                            <div class="thumb">
                                <span class="badge bg-theme"><i class="fa fa-clock-o"></i></span>
                            </div>
                            <div class="details">
                                <p><muted><a href="#">D 398</a></muted><br/>
                                High Court Galle<br/>
                                Step :  Initial Appearance
                                </p>
                            </div>
                        </div>
                        <!-- Fourth Action -->
                        <div class="desc">
                            <div class="thumb">
                                <span class="badge bg-theme"><i class="fa fa-clock-o"></i></span>
                            </div>
                            <div class="details">
                                <p><muted><a <c:url value='/href="#'/>">D 398</a></muted><br/>
                                District Court Galle<br/>
                                Step : Preliminary Hearing 
                                </p>
                            </div>
                        </div> 

                    </div><!-- /col-lg-3 -->		
                </section>
            </section>
            <!-- /MAIN CONTENT -->

            <!--main content end-->



            <!--footer start-->

            <!--footer end-->
        </section>

        <!-- js placed at the end of the document so the pages load faster -->
        <script src="<c:url value='/assets/js/jquery.js'/>"></script>
        <script src="<c:url value='/assets/js/bootstrap.min.js'/>"></script>
        <script src="<c:url value='/assets/js/jquery-ui-1.9.2.custom.min.js'/>"></script>
        <script src="<c:url value='/assets/js/fullcalendar/fullcalendar.min.js'/>"></script>    
        <script src="<c:url value='/assets/js/jquery.ui.touch-punch.min.js'/>"></script>
        <script class="include" type="text/javascript" src="<c:url value='/assets/js/jquery.dcjqaccordion.2.7.js'/>"></script>
        <script src="<c:url value='/assets/js/jquery.scrollTo.min.js'/>"></script>
        <script src="<c:url value='/assets/js/jquery.nicescroll.js'/>" type="text/javascript"></script>


        <!--common script for all pages-->
        <script src="<c:url value='/assets/js/common-scripts.js'/>"></script>

        <!--script for this page-->
        <script src="<c:url value='/assets/js/calendar-conf-events.js'/>"></script>    

        <script>
            //custom select box

            $(function () {
                $('select.styled').customSelect();
            });
            
            $(".stats-left").click(function() {
                window.alert("Clicked :)");
            }
        </script>
        
    </body>
</html>
