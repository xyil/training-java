package com.hcl.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hcl.model.User;

@WebServlet("/login")
public class LoginController extends HttpServlet{
	
	protected void doPost(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException{
		res.setContentType("test/html");
		PrintWriter pw=res.getWriter();
		String uname=req.getParameter("uname");
		String pwd=req.getParameter("pwd");
		
		User u1=new User();
		u1.setUsername(uname);
		u1.setPassword(pwd);
		req.setAttribute("abc", u1);
		
		boolean status=u1.validateUserNamePwd();
		if(status) {
			RequestDispatcher rd=req.getRequestDispatcher("success.jsp");
			rd.forward(req, res);
		}else {
			RequestDispatcher rd=req.getRequestDispatcher("failure.jsp");
			rd.forward(req, res);
		}
	}
		protected void doGet(HttpServletRequest req,HttpServletResponse res)
				throws ServletException,IOException{
			doPost(req,res);
		}
	}

