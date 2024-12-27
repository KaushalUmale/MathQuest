package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ResultServlet
 */
@WebServlet("/ResultServlet")
public class ResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 @Override
	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        String[] correctAnswers = {  "5", "3", "8", "8", "5", "9", "10", "5", "10", "10", 
	        	    "5", "12", "10", "7", "12", "10", "7", "12", "10", "7", 
	        	    "10", "10", "6", "14", "10"};
	        int score = 0;

	        for (int i = 0; i < correctAnswers.length; i++) {
	            String userAnswer = request.getParameter("q" + (i + 1));
	            if (userAnswer != null && userAnswer.equalsIgnoreCase(correctAnswers[i])) {
	                score++;
	            }
	        }

	        request.setAttribute("score", score);
	        request.setAttribute("total", correctAnswers.length);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
	        dispatcher.forward(request, response);
	    }
	}
