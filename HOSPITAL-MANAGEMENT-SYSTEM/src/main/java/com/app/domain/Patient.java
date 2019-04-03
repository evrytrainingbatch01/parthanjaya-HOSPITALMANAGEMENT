package com.app.domain;

public class Patient {
	private int id;
	private String patientName;
	private int patientAge;
	private String bloodGroup;
	private String checkUp;
	private String doctorName;
	private String testRecommended;

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(int id, String patientName, int patientAge, String bloodGroup, String checkUp, String doctorName,
			String testRecommended) {
		super();
		this.id = id;
		this.patientName = patientName;
		this.patientAge = patientAge;
		this.bloodGroup = bloodGroup;
		this.checkUp = checkUp;
		this.doctorName = doctorName;
		this.testRecommended = testRecommended;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getPatientAge() {
		return patientAge;
	}

	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getCheckUp() {
		return checkUp;
	}

	public void setCheckUp(String checkUp) {
		this.checkUp = checkUp;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getTestRecommended() {
		return testRecommended;
	}

	public void setTestRecommended(String testRecommended) {
		this.testRecommended = testRecommended;
	}

}
