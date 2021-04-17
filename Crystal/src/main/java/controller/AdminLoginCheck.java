package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AdminCheck;

import model.TeamAdmin;

/**
 * Servlet implementation class AdminLoginCheck
 */
@WebServlet("/AdminLoginCheck")
public class AdminLoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try {
			String username = request.getParameter("username");
			String password1 = request.getParameter("passwd");
			
			TeamAdmin sysUser = new TeamAdmin();
			sysUser.setUsername(username);
			sysUser.setPassword(password1);
			AdminCheck check1 = new AdminCheck();
			TeamAdmin sysUser1 = check1.checkCredential(sysUser);
			if(sysUser1 !=null) {
				request.setAttribute("username", sysUser.getUsername());
				RequestDispatcher dispatch = request.getRequestDispatcher("AdminDashboard.jsp");
				dispatch.forward(request, response);
			}
		}
		catch(Exception e) {
			request.setAttribute("errorInfo","Error Occured During Logging::::"+e.getMessage());
			e.printStackTrace();
			RequestDispatcher dispatch=request.getRequestDispatcher("ErrorFile.jsp");
			dispatch.forward(request, response);
		}
	
	}

}
