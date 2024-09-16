package forms;

import java.io.IOException;
import java.util.Objects;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConfirmServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String phone_number = request.getParameter("phone_number");
		
		request.setAttribute("name", name);
		request.setAttribute("email", email);
		request.setAttribute("address", address);
		request.setAttribute("phone_number", phone_number);
		
		name = Objects.toString(name, "");
		email = Objects.toString(email, "");
		address = Objects.toString(address, "");
		phone_number = Objects.toString(phone_number, "");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/pages/confirmPage.jsp");
		dispatcher.forward(request, response);
	}
}
