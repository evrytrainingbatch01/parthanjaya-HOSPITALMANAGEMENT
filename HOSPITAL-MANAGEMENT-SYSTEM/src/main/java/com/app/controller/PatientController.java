package com.app.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.dao.IPatientDao;
import com.app.dao.PatientDaoImpl;
import com.app.domain.Patient;

public class PatientController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Patient patient = new Patient();
	IPatientDao dao = new PatientDaoImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		if (request.getParameter("addUser") != null) {

			String patientName = request.getParameter("patientName");
			int patientAge = Integer.parseInt(request.getParameter("patientAge"));
			String bloodGroup = request.getParameter("bloodGroup");
			String checkup = request.getParameter("checkUp");
			String doctorName = request.getParameter("doctorName");
			String testRecommended = request.getParameter("testRecommended");

			patient.setPatientName(patientName);
			patient.setPatientAge(patientAge);
			patient.setBloodGroup(bloodGroup);
			patient.setCheckUp(checkup);
			patient.setDoctorName(doctorName);
			patient.setTestRecommended(testRecommended);

			dao.addPatient(patient);
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		} else if (request.getParameter("showAllPatients") != null) {
			List<Patient> showAllPatients = new ArrayList();
			showAllPatients = dao.showAllPatients();
			request.setAttribute("patientList", showAllPatients);
			RequestDispatcher rd = request.getRequestDispatcher("showAll.jsp");
			rd.forward(request, response);
		}
	}

}
