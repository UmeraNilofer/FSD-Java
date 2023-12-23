package com.healthcare.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.healthcare.entity.Patient;
import com.healthcare.service.PatientService;

/**
 * Servlet implementation class PatientController
 */
@WebServlet("/PatientController")
public class PatientController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PatientController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PatientService ps = new PatientService();
		List<Patient> listOfPatient = ps.findAllPatient();
		
		HttpSession hs = request.getSession();
		hs.setAttribute("patients", listOfPatient);
		
		response.sendRedirect("doctorHome.jsp");
		response.setContentType("text/html");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();			// object created.
		//created service class object.
		PatientService ps=new PatientService();
		// receive the value from form
		String operation=request.getParameter("operation");
		
		if(operation.equals("add")) {
			String name=request.getParameter("name");
			String pemail=request.getParameter("pemail");
			String phone=request.getParameter("phone");
			String age=request.getParameter("age");
			String diagnosis=request.getParameter("diagnosis");
			String remark=request.getParameter("remark");
			
			Patient p=new Patient();
			p.setName(name);
			p.setPemail(pemail);
			p.setPhone(phone);
			p.setAge(age);
			p.setDiagnosis(diagnosis);
			p.setRemark(remark);
			
			String result = ps.storePatient(p);
			pw.print(result);
			RequestDispatcher rd = request.getRequestDispatcher("addPatient.jsp");
			rd.include(request, response);
		}
		
		response.setContentType("text/html");
	}
	
}
