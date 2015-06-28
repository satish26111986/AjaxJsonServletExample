package com.home.mvc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.home.mvc.db.ConnectionFactory;
import com.home.mvc.model.Employee;

/**
 * Servlet implementation class Controller
 */
/* @WebServlet("/Controller") */
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Controller() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String json;
		String stateDropDown = request.getParameter("stateName");
		System.err.println("I ma put");
		List<String> stateList = new ArrayList<String>();
		stateList.add("Jind");
		stateList.add("Gurgoan");
		stateList.add("Jazzar");

		stateList.add("Kaithal");
		request.setAttribute("DropDown", stateList);
		json = new Gson().toJson(stateList);
		// request.getSession().setAttribute("DropDown",stateList);
		response.setContentType("application/json");
		response.getWriter().write(json);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String json;
		String stateDropDown = request.getParameter("stateName");
		System.err.println("I ma put");
		List<String> stateList = new ArrayList<String>();
		stateList.add("Jind");
		stateList.add("Gurgoan");
		stateList.add("Jazzar");

		stateList.add("Kaithal");
		request.setAttribute("DropDown", stateList);
		json = new Gson().toJson(stateList);
		// request.getSession().setAttribute("DropDown",stateList);
		response.setContentType("application/json");
		response.getWriter().write(json);

	}

}
