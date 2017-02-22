<%-- 
    Document   : addClient
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

        <title>All Clients | Lawyer Diary</title>

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
                        <li><a id=menuList href="<c:url value='/addClient.html'/>"><img src="<c:url value='/assets/img/addClientWhite.png'/>" width="25px">&nbsp&nbsp&nbsp&nbspAdd New Client</a></li>
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
                        <!--client list starts-->
                        <div style="background-color: #faf9fb; padding:3%;">
                           <h3>Client List</h3>
                                    
                            <hr>

                            <table class="table table-bordered table-striped table-hover table-responsive" cellspacing="15" style="font-size: 15px;">
                                <thead>
                                    <tr>
                                        <th> ID</th>
                                        <th> Name</th>
                                        <th> Address</th>
                                        <th> Mobile</th>
                                        <th> Status</th>
                                        <th> Action</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach items="${$clientList}" var="client">
                                        <tr>
                                            <td>
                                                <c:out value="${client.clientId}"/>
                                            </td>
                                            <td>
                                                <c:out value="${client.firstName} ${client.lastName}"/>
                                            </td>
                                            <td>
                                                <c:out value="${client.address}"/>
                                            </td>
                                            <td>
                                                <c:out value="${client.mobile}"/>
                                            </td>
                                            <td><span class="label label-success label-mini">Paid</span></td>
                                            <td>                                                       
                                                <button class="btn btn-primary btn-xs" data-toggle="modal" data-target="#editModal"><i class="fa fa-pencil"></i></button>
                                                <button class="btn btn-danger btn-xs" data-toggle="modal" data-target="#deleteModal"><i class="fa fa-trash-o"></i></button>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>	
                        </div>
                        <!--Client list end-->

                        <!-- Modal Edit-->
                        <div aria-hidden="true" aria-labelledby="myModalLabel" role="dialog" tabindex="-1" id="editModal" class="modal fade">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header" style="background-color: lightskyblue">
                                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                        <h4 class="modal-title">Edit Client</h4>
                                    </div>
                                    <div class="modal-body">
                                        <form id="addClient" action="${pageContext.servletContext.contextPath}/client/edit" method="POST">
                                            <div class="form-group">
                                                <label style="color: #000000;">First Name</label>
                                                <input type="text" class="form-control" id="first_name" name="first_name" autofocus required>	            		
                                                <div class="help-block with-errors"></div>  
                                            </div>    
                                            <div class="form-group">  
                                                <label style="color: #000000;">Last Name</label>
                                                <input type="text" class="form-control" id="last_name" name="last_name" required>
                                                <div class="help-block with-errors"></div>  
                                            </div>	
                                            <div class="form-group">
                                                <label style="color: #000000;">Mobile Number</label>
                                                <input type="text" class="form-control" id="mobile" name="mobile" required>	            	            
                                                <div class="help-block with-errors"></div>  
                                            </div>
                                            <div class="form-group">
                                                <label style="color: #000000;">Address</label>
                                                <textarea type="text" class="form-control" id="address" name="address" required></textarea>           	            
                                                <div class="help-block with-errors"></div>  
                                            </div>
                                            <button class="btn btn-info" href="index.html" type="submit">Save Changes</button> 
                                            <button class="btn btn-default" href="index.html">Cancel</button>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- modal Edit -->
                        <!-- Modal Delete-->
                        <div aria-hidden="true" aria-labelledby="myModalLabel" role="dialog" tabindex="-1" id="deleteModal" class="modal fade">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header" style="background-color: lightcoral">
                                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                        <h4 class="modal-title">Delete Client</h4>
                                    </div>
                                    <div class="modal-body">
                                        <form id="deleteClient" action="${pageContext.servletContext.contextPath}/client/delete" method="POST">
                                            <div>
                                                <table style="width: 60%;">
                                                    <tr>
                                                        <th>Name</th>
                                                        <td>Janadhi Namayakkara</td>
                                                    </tr>
                                                    <tr>
                                                        <th>Address</th>
                                                        <td>No 05, Temple Rd, Thotagoda, Akmeemana</td>
                                                    </tr>
                                                    <tr>
                                                        <th>Mobile</th>
                                                        <td>071-3609313</td>
                                                    </tr>
                                                </table>
                                            </div>
                                            <div>
                                                <br>
                                            </div>
                                            <button class="btn btn-danger"  type="submit">Delete</button>
                                            <button class="btn btn-default">Cancel</button>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- modal Delete -->
                    </div>  
                    <!--Notification starts-->            
                    <div class="col-lg-3 ds">      
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
                    </div>
                    <!--Client list end-->
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
        <script src="<c:url value='/assets/js/jquery.ui.touch-punch.min.js'/>"></script>
        <script class="include" type="text/javascript" src="<c:url value='/assets/js/jquery.dcjqaccordion.2.7.js'/>"></script>
        <script src="<c:url value='/assets/js/jquery.scrollTo.min.js'/>"></script>
        <script src="<c:url value='/assets/js/jquery.nicescroll.js'/>" type="text/javascript"></script>
        <script src="<c:url value='/assets/js/validator.min.js'/>"></script> 

        <!--common script for all pages-->
        <script src="<c:url value='/assets/js/common-scripts.js'/>"></script>

        <!--script for this page-->


        <script>
            //custom select box

            $(function () {
                $('select.styled').customSelect();
            });

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
