# MathQuest Quiz Application

## Description

This is a simple web-based quiz application built using Java Servlets, JSP, and a basic JavaBean class for managing quiz questions. 
The application allows users to answer a series of questions, submit their responses, and view their results on a separate page.

## Features

- **Multiple Questions**: The quiz includes 25 math-based questions.
- **User-Friendly Interface**: Users can input their answers in a form and submit them.
- **Result Calculation**: After submission, the application calculates and displays the user's score out of the total number of questions.
- **Retry Option**: Users can retake the quiz at any time.

## Technologies Used

- **Java** (for backend logic)
- **Servlets** (to handle requests and responses)
- **JSP** (for rendering the quiz page and result page)
- **HTML/CSS** (for the frontend layout and design)

## File Structure

- **Entity/Questions.java**: JavaBean representing quiz questions.
- **Controller/QuizServlet.java**: Servlet for loading and displaying quiz questions.
- **Controller/ResultServlet.java**: Servlet for processing the answers and showing the result.
- **quiz.jsp**: JSP page for presenting the quiz form.
- **result.jsp**: JSP page displaying the quiz result.
- **index.html**: Landing page to start the quiz.


