/**
 * This is the implementation of ClinicRoom domain class.
 * All attributes of ClinicRoom are declared; 
 * Attributes are defined and retrieved using setter getter methods respectively
 * @author Tonmoy Saha
 */


package ca.concordia.sdm.domain;



public class ClinicAppointment {

	private int clinicAppointmentId;
	private String clinicAppointmentType;
	private String clinicAppointmentTimeSlot;
	
	public void setClinicAppointmentId(int clinicAppointmentId) {
		this.clinicAppointmentId = clinicAppointmentId;
	}
	public int getClinicAppointmentId() {
		return clinicAppointmentId;
	}
	
	public void setClinicAppointmentType(String clinicAppointmentType) {
		this.clinicAppointmentType = clinicAppointmentType;
	}
	public String getClinicAppointmentType() {
		return clinicAppointmentType;
	}
	
	public void setClinicAppointmentTimeSlot(String clinicAppointmentTimeSlot) {
		this.clinicAppointmentTimeSlot = clinicAppointmentTimeSlot;
	}
	public String getClinicAppointmentTimeSlot() {
		return clinicAppointmentTimeSlot;
	}
	
	
	
	
	
	
	
	
	
	

}
