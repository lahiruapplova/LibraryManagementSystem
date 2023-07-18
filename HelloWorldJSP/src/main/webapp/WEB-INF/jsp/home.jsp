<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student Management System</title>
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

        ul {
            list-style-type: none;
            padding: 0;
            margin: 20px 0;
            text-align: center;
        }

        li {
            display: block; /* Change display to "block" to create a new line for each list item */
            margin-bottom: 15px; /* Add some vertical space between each link */
        }

        a {
            text-decoration: none;
            color: #008080;
            font-size: 18px;
        }

        a:hover {
            color: #006666;
        }
    </style>
</head>
<body>
<h1>Library Management System</h1>
<ul><br><br>
    <li><a href="/addStudent">Add Student</a></li>
    <li><a href="/deleteStudent">Delete Student</a></li>
    <li><a href="/updateStudent">Update Student</a></li>
    <li><a href="/displayAllStudents">View Students</a></li>
    <br><br>

    <li><a href="/addBook">Add Book</a></li>
    <li><a href="/deleteBook">Delete Book</a></li>
    <li><a href="/updateBook">Update Book details</a></li>
    <li><a href="/displayAllBooks">View Books</a></li>

</ul>
</body>
</html>
