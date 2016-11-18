/**
 * This is the implementation of Doctor domain class.
 * All attributes of Doctor are declared; 
 * Attributes are defined and retrieved using setter getter methods respectively
 * @author Tonmoy Saha
 */


package ca.concordia.sdm.domain;



public class Doctor {

	private int doctorId;
	private String doctorName;
	private String doctorAddress;
	private String doctorGender;
	private String doctorBirthDate;
	private String doctorEmail;
	private String doctorRegNo;
	private String doctorPhone;
	
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorAddress(String doctorAddress) {
		this.doctorAddress = doctorAddress;
	}
	public String getDoctorAddress() {
		return doctorAddress;
	}
	public void setDoctorGender(String doctorGender) {
		this.doctorGender = doctorGender;
	}
	public String getDoctorGender() {
		return doctorGender;
	}
	public void setDoctorBirthDate(String doctorBirthDate) {
		this.doctorBirthDate = doctorBirthDate;
	}
	public String getDoctorBirthDate() {
		return doctorBirthDate;
	}
	public void setDoctorEmail(String doctorEmail) {
		this.doctorEmail = doctorEmail;
	}
	public String getDoctorEmail() {
		return doctorEmail;
	}
	public void setDoctorRegNo(String doctorRegNo) {
		this.doctorRegNo = doctorRegNo;
	}
	public String getDoctorRegNo() {
		return doctorRegNo;
	}
	public void setDoctorPhone(String doctorPhone) {
		this.doctorPhone = doctorPhone;
	}
	public String getDoctorPhone() {
		return doctorPhone;
	}
	
	

}
