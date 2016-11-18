/**
 * This is the implementation of Patient domain class.
 * All attributes of Patient are declared; 
 * Attributes are defined and retrieved using setter getter methods respectively
 * @author Tonmoy Saha
 */


package ca.concordia.sdm.domain;



public class Patient {

	private int patientId;
	private String patientName;
	private String patientAddress;
	private String patientGender;
	private String patientBirthDate;
	private String patientEmail;
	private String patientHealthCardNo;
	private String patientPhone;
	
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}
	public String getPatientAddress() {
		return patientAddress;
	}
	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}
	public String getPatientGender() {
		return patientGender;
	}
	public void setPatientBirthDate(String patientBirthDate) {
		this.patientBirthDate = patientBirthDate;
	}
	public String getPatientBirthDate() {
		return patientBirthDate;
	}
	public void setPatientEmail(String patientEmail) {
		this.patientEmail = patientEmail;
	}
	public String getPatientEmail() {
		return patientEmail;
	}
	public void setPatientHealthCardNo(String patientHealthCardNo) {
		this.patientHealthCardNo = patientHealthCardNo;
	}
	public String getPatientHealthCardNo() {
		return patientHealthCardNo;
	}
	public void setPatientPhone(String patientPhone) {
		this.patientPhone = patientPhone;
	}
	public String getPatientPhone() {
		return patientPhone;
	}
	
	
	
	
	

}
