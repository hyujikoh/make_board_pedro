<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>List</title>
</head>
<body>

<h2> 게시글 목록 </h2>

<button class="btn btn-primary" onclick="location.href='/insert'">글쓰기</button>

<div class="container">
    <table class="table table-hover">

        <thead>
        <tr>
            <th>No</th>
            <th>Type</th>
            <th>Title</th>
            <th>Content</th>
            <th>Cre_User</th>
            <th>Mod_User</th>
            <th>Cre_date</th>
            <th>Mod_date</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="item" items="${columns.contents}">
<%--            <tr onclick="location.href='/detail/${item.board_seq}'">--%>
                <td>${item.board_seq}</td>
                <td>${item.board_type}</td>
                <td>${item.title}</td>
                <td>${item.content}</td>
                <td>${item.cre_user_id}</td>
                <td>${item.mod_user_id}</td>
                <td>${item.cre_date}</td>
                <td>${item.mod_date}</td>
                    <%--                <td>${item.content_status}</td>--%>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>


<%@ include file="../bootstrap.jsp" %>
</body>
</html>