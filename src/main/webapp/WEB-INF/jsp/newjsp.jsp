<%-- 
    Document   : newjsp
    Created on : Feb 22, 2017, 5:12:59 PM
    Author     : Janadhi Nanayakkara
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="<c:url value='/assets/css/bootstrap.css'/>" >
    </head>
    <body>
        <div class="row">
            <div class="col-xs-12 col-md-12">
                <table class="table table-condensed table-hover table-bordered">
                    <thead>
                        <tr>
                            <th>Firstname</th>
                            <th>Lastname</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>John</td>
                            <td>Doe</td>

                        </tr>
                        <tr>
                            <td>Sam</td>
                            <td>Smith</td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>

        <div class="modal fade" id="myModal">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title">EDIT</h4>
                    </div>
                    <div class="modal-body">
                        <p><input type="text" class="input-sm" id="txtfname"/></p>
                        <p><input type="text" class="input-sm" id="txtlname"/></p>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                        <button type="button" class="btn btn-primary">Save changes</button>
                    </div>
                </div><!-- /.modal-content -->
            </div><!-- /.modal-dialog -->
        </div><!-- /.modal -->
        
        <script src="<c:url value='/assets/js/jquery.js'/>"></script>
        <script src="<c:url value='/assets/js/bootstrap.min.js'/>"></script>
        <script type="text/javascript">
            $('table tbody tr  td').on('click', function () {
                $("#myModal").modal("show");
                $("#txtfname").val($(this).closest('tr').children()[0].textContent);
                $("#txtlname").val($(this).closest('tr').children()[1].textContent);
            });
        </script>
    </body>
</html>
