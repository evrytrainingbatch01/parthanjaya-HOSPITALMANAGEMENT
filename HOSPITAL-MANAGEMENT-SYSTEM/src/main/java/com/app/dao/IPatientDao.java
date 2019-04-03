package com.app.dao;

import java.util.List;

import com.app.domain.Patient;

public interface IPatientDao {
	public void addPatient(Patient patient);
	public List<Patient> showAllPatients();

}
