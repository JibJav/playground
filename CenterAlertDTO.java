package com.okta.developer.alert.service.dto;

public class CenterAlertDTO {

	private String patientName;
	private String coronaStatus;

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getCoronaStatus() {
		return coronaStatus;
	}

	public void setCoronaStatus(String coronaStatus) {
		this.coronaStatus = coronaStatus;
	}

}