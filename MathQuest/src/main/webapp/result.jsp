<!DOCTYPE html>
<html>
<head>
    <title>Quiz Result</title>
</head>
<body style="color:#50e136; text-align: center; font-family: Arial, sans-serif;">
    <h1>Your Quiz Results</h1>
    <p style="color:black">You scored <%= request.getAttribute("score") %> out of <%= request.getAttribute("total") %>.</p>

<style>
        a {
            text-decoration: none;
            font-size: 1.2em;
            color: white;
            background-color: #50e136;
            padding: 10px 15px;
            border-radius: 5px;
            transition: background-color 0.4s;
        }

        a:hover {
            background-color: #3ba524;
        }
        </style>
    <br>
    <a href="QuizServlet" >Take Quiz Again</a>
</body>
</html>