/**
 * This is the implementation of ClinicRoom domain class.
 * All attributes of ClinicRoom are declared; 
 * Attributes are defined and retrieved using setter getter methods respectively
 * @author Tonmoy Saha
 */


package ca.concordia.sdm.domain;



public class ClinicRoom {

	private int clinicRoomId;
	private String clinicRoomNumber;
	private String clinicRoomPhoneExt;
	private String clinicRoomDescription;
	
	public void setClinicRoomId(int clinicRoomId) {
		this.clinicRoomId = clinicRoomId;
	}
	public int getClinicRoomId() {
		return clinicRoomId;
	}
	public void setClinicRoomNumber(String clinicRoomNumber) {
		this.clinicRoomNumber = clinicRoomNumber;
	}
	public String getClinicRoomNumber() {
		return clinicRoomNumber;
	}
	public void setClinicRoomPhoneExt(String clinicRoomPhoneExt) {
		this.clinicRoomPhoneExt = clinicRoomPhoneExt;
	}
	public String getClinicRoomPhoneExt() {
		return clinicRoomPhoneExt;
	}
	public void setClinicRoomDescription(String clinicRoomDescription) {
		this.clinicRoomDescription = clinicRoomDescription;
	}
	public String getClinicRoomDescription() {
		return clinicRoomDescription;
	}
	
	
	
	
	
	
	
	

}
