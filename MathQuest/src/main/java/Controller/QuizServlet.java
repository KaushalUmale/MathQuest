package Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entity.Questions;

/**
 * Servlet implementation class QuizServlet
 */
@WebServlet("/QuizServlet")
public class QuizServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 @Override
	    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        List<Questions> questions = new ArrayList<>();
	        questions.add(new Questions(1, "What is 2 + 3 ?", "5"));
	        questions.add(new Questions(2, "What is 5 - 2 ?", "3"));
	        questions.add(new Questions(3, "What is 4 * 2 ?", "8"));
	        questions.add(new Questions(4, "What is 7 + 1 ?", "8"));
	        questions.add(new Questions(5, "What is 9 - 4 ?", "5"));
	        questions.add(new Questions(6, "What is 3 * 3 ?", "9"));
	        questions.add(new Questions(7, "What is 6 + 4 ?", "10"));
	        questions.add(new Questions(8, "What is 10 - 5 ?", "5"));
	        questions.add(new Questions(9, "What is 2 * 5 ?", "10"));
	        questions.add(new Questions(10, "What is 8 + 2 ?", "10"));
	        questions.add(new Questions(11, "What is 12 - 7 ?", "5"));
	        questions.add(new Questions(12, "What is 4 * 3 ?", "12"));
	        questions.add(new Questions(13, "What is 5 + 5 ?", "10"));
	        questions.add(new Questions(14, "What is 15 - 8 ?", "7"));
	        questions.add(new Questions(15, "What is 2 * 6 ?", "12"));
	        questions.add(new Questions(16, "What is 7 + 3 ?", "10"));
	        questions.add(new Questions(17, "What is 11 - 4 ?", "7"));
	        questions.add(new Questions(18, "What is 3 * 4 ?", "12"));
	        questions.add(new Questions(19, "What is 9 + 1 ?", "10"));
	        questions.add(new Questions(20, "What is 13 - 6 ?", "7"));
	        questions.add(new Questions(21, "What is 5 * 2 ?", "10"));
	        questions.add(new Questions(22, "What is 6 + 4 ?", "10"));
	        questions.add(new Questions(23, "What is 14 - 8 ?", "6"));
	        questions.add(new Questions(24, "What is 2 * 7 ?", "14"));
	        questions.add(new Questions(25, "What is 8 + 2 ?", "10"));

	        request.setAttribute("questions", questions);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("quiz.jsp");
	        dispatcher.forward(request, response);
	    }
	}  