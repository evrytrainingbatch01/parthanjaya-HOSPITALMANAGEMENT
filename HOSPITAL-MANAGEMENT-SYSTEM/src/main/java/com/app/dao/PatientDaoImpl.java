package com.app.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.domain.Patient;
import com.app.util.HibernateUtil;

public class PatientDaoImpl implements IPatientDao {
	Session ses = HibernateUtil.getSessionFactory().openSession();
//add a new patient 
	public void addPatient(Patient patient) {
		Transaction tx = ses.beginTransaction();
		ses.save(patient);
		tx.commit();
	}
//all the patients
	public List<Patient> showAllPatients() {
		List<Patient> patientList = new ArrayList();
		Query query = ses.createQuery("From PATIENT");
		patientList = query.list();
		return patientList;

	}

}
