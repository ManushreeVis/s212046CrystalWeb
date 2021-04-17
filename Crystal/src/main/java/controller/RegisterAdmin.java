package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.RegisterAdminDAO;
import model.TeamAdmin;

@WebServlet("/RegisterAdmin")
public class RegisterAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RegisterAdmin() {
        
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		try {
			String firstname = request.getParameter("fname");
			String lastname = request.getParameter("lname");
			String username = request.getParameter("username");
			String password = request.getParameter("passwd");
			String cpassword = request.getParameter("cpasswd");
			String gender = (request.getParameter("gender"));
			String email = request.getParameter("email");
			String mobno = request.getParameter("mobno");
			String adminaddress = request.getParameter("adminaddress");
			if(password.equals(cpassword)) {
				TeamAdmin newMember = new TeamAdmin(firstname, lastname, username, password, gender, email, mobno, adminaddress);
				RegisterAdminDAO registerDao = new RegisterAdminDAO();
				if(registerDao.registerMember(newMember)) {
					request.setAttribute("username", newMember.getUsername());
					RequestDispatcher dispatch = request.getRequestDispatcher("AdminDashboard.jsp");
					dispatch.forward(request, response);
				}
				else {
					request.setAttribute("errorInfo", "Error Occured During Registration");
					RequestDispatcher dispatch=request.getRequestDispatcher("ErrorFile.jsp");
					dispatch.forward(request, response);
				}
			}
			else {
				request.setAttribute("errorInfo","Passwords do not match.");
				RequestDispatcher dispatch = request.getRequestDispatcher("ErrorFile.jsp");
				dispatch.forward(request, response);
			}
	
		}
		catch(Exception e) {
			request.setAttribute("errorInfo","Error Occured Before Registering::::"+e.getMessage());
			RequestDispatcher dispatch=request.getRequestDispatcher("ErrorFile.jsp");
			dispatch.forward(request, response);
		}
	}

}
