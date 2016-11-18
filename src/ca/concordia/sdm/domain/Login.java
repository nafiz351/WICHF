/**
 * This is the implementation of Login domain class.
 * All attributes of Login are declared; 
 * Attributes are defined and retrieved using setter getter methods respectively
 * @author Tonmoy Saha
 */


package ca.concordia.sdm.domain;



public class Login {

	private int loginId;
	private String loginName;
	private String loginPassword;
	private String loginType;
	
	
	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}
	public int getLoginId() {
		return loginId;
	}
	
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getLoginName() {
		return loginName;
	}
	
	
	
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
	public String getLoginPassword() {
		return loginPassword;
	}
	public void setLoginType(String loginType) {
		this.loginType = loginType;
	}
	public String getLoginType() {
		return loginType;
	}
	
	


}
