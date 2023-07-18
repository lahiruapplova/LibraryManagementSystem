<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Book</title>
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

        form {
            max-width: 400px;
            margin: 0 auto;
            background-color: #fff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
        }

        label {
            display: block;
            margin-bottom: 5px;
            color: #333;
        }

        input[type="text"] {
            width: 100%;
            padding: 8px;
            font-size: 16px;
            border: 1px solid #ccc;
            border-radius: 3px;
        }

        select {
            width: 100%;
            padding: 8px;
            font-size: 16px;
            border: 1px solid #ccc;
            border-radius: 3px;
        }

        input[type="submit"] {
            display: block;
            width: 100%;
            padding: 10px;
            margin-top: 10px;
            background-color: #008080;
            color: #fff;
            border: none;
            border-radius: 3px;
            cursor: pointer;
            font-size: 16px;
        }

        input[type="submit"]:hover {
            background-color: #006666;
        }
        /* Additional styling for the home button */
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
<h1>Add Book</h1>
<a href="/home" class="home-button">Home</a>
<form action="/addBook" method="post">
    <label for="bookname">Book Name:</label>
    <input type="text" id="bookname" name="bookname" required><br><br>

    <label for="BookCategory">Category:</label>
    <select id="BookCategory" name="BookCategory" required>
        <option value="fiction">Fiction</option>
        <option value="non-fiction">Non-Fiction</option>
        <option value="science-fiction">Science Fiction</option>
        <option value="mystery">Mystery</option>
        <!-- Add more options as needed -->
    </select><br><br>

    <input type="submit" value="Add Book">
</form>
</body>
</html>
