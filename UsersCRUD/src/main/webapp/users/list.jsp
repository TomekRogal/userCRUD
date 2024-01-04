<!DOCTYPE html>
<html lang="en">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<head>

  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>SB Admin 2 - Dashboard</title>

  <!-- Custom fonts for this template-->
  <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

  <!-- Custom styles for this template-->
  <link href="<c:url value="/theme/css/sb-admin-2.css"/>" rel="stylesheet">

</head>
<body id="page-top">

<!-- Page Wrapper -->
<div id="wrapper">
<%@ include file="/users/header.jsp" %>
    <!-- Content Wrapper -->
    <div id="content-wrapper" class="d-flex flex-column">

        <!-- Main Content -->
        <div id="content">
      <!-- Begin Page Content -->
<div class="container-fluid">
        <!-- Page Heading -->
<!-- /.container-fluid -->
        <div class="d-sm-flex align-items-center justify-content-between mb-4">
            <h1 class="h3 mb-0 text-gray-800">UsersCRUD</h1>
          <a href="add" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"><i class="fas fa-download fa-sm text-white-50"></i>Dodaj użytkownika</a>
        </div>
        <!-- Content Row -->
          <!-- Card Body -->
          <div class="card-body">
              <div class="table-responsive">
                 <table class = "table">
                     <h2 class="h3 mb-0 text-gray-800">Lista użytkowników</h2>
                     <tr>
                         <th>Id</th>
                         <th>Nazwa użytkownika</th>
                         <th>Email</th>
                         <th>Wykonaj</th>
                     </tr>
                     <c:forEach items="${users}" var="user">
                         <tr>
                             <td> ${user.getId()} </td>
                             <td> ${user.getUserName()} </td>
                             <td> ${user.getEmail()} </td>
                             <td>
                                 <a href='<c:url value="/user/delete?id=${user.id}"/>'>Usuń</a>
                                 <a href='<c:url value="/user/edit?id=${user.id}"/>'>Edytuj</a>
                                 <a href='<c:url value="/user/show?id=${user.id}"/>'>Pokaż</a>
                             </td>
                         </tr>
                     </c:forEach>
                 </table>
              </div>
          </div>
        </div>
</div>

            <!-- /.container-fluid -->

        <!-- End of Main Content -->
        <%@ include file="/users/footer.jsp" %>

    </div>
    <!-- End of Content Wrapper -->

</div>
<!-- End of Page Wrapper -->
</body>
</html>

