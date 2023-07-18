<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f7f7f7;
            margin: 20px;
            padding: 0;
        }

        p {
            text-align: center;
            font-size: 24px;
            color: #008080;
            margin-top: 50px;
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
<a href="/home" class="home-button">Home</a>
<p>Successfully updated the student details</p>
</body>
</html>
