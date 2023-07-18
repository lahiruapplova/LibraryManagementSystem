<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Student Table</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f7f7f7;
            margin: 20px;
            padding: 0;
        }

        h1 {
            color: #008080;
            text-align: center;
        }

        table {
            border-collapse: collapse;
            width: 100%;
            background-color: #fff;
            border: 1px solid #ccc;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
            border-radius: 5px;
        }

        th, td {
            border: 1px solid #ccc;
            padding: 10px;
            text-align: left;
        }

        th {
            background-color: #f2f2f2;
            color: #008080;
        }

        tr:hover {
            background-color: #f5f5f5;
        }
        .home-button {
            display: block;
            width: auto; /* Adjust the width automatically based on content */
            padding: 5px 10px; /* Adjust the padding to make it smaller */
            position: absolute; /* Position the button absolutely */
            top: 20px; /* Position from the top */
            left: 20px; /* Position from the left */
            background-color: #008080;
            color: #fff;
            border: none;
            border-radius: 3px;
            cursor: pointer;
            font-size: 14px; /* Reduce the font size */
            text-align: center;
            text-decoration: none; /* Remove underline on the anchor */
        }

        .home-button:hover {
            background-color: #006666;
        }
    </style>
</head>
<body>
<h1>Book Table</h1>
<a href="/home" class="home-button">Home</a>
<table>
    <thead>
    <tr>
        <th>Book ID</th>
        <th>Book name</th>
        <th>Category</th>

    </tr>
    </thead>
    <tbody>
    <%-- The table rows will be populated dynamically --%>
    <c:forEach items="${books}" var="book">
        <tr>
            <td>${book.bookId}</td>
            <td>${book.bookname}</td>
            <td>${book.bookCategory}</td>

        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
