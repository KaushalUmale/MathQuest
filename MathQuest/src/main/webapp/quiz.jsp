<%@ page import="Entity.Questions" %>
<%@ page import="java.util.List" %>

<!DOCTYPE html>
<html>
<head>
    <title>Quiz</title>
</head>
<body>
    <h1  style="color:#50e136; text-align: center; font-family: Arial, sans-serif;">Answer the following questions:</h1>
    <form style="text-align: center;"   action="ResultServlet" method="post">
        <%
            List<Questions> questions = (List<Questions>) request.getAttribute("questions");

          
            if (questions != null && !questions.isEmpty()) { 
                for (Questions question : questions) {  
        %>
                    <div>
                        <p><%= question.getId() %>. <%= question.getQuestionText() %></p>
                        <input type="text" name="answer<%= question.getId() %>" placeholder="Your answer here" >
                    </div><br>
        <%
                }
            } else {
        %>
                <p>No questions available. Please try again later.</p>
        <%
            }
        %>
          <style>
        button {
        text-align: center;
            text-decoration: none;
            font-size: 1.1em;
            color: white;
            background-color: #50e136;
            padding: 5px 15px;
            border-radius: 5px;
            transition: background-color 0.4s;
            border:red;
        }

        button:hover {
            background-color: #3ba524;
        }
    </style>

        <button type="submit"  style="text-align: center;">Submit Quiz</button>
    </form>
</body>
</html>