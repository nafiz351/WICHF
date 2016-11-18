package ca.concordia.sdm.services;


import java.util.List;

import ca.concordia.sdm.domain.Login;

public interface LoginService {
	public void insertData(Login login);

	public List<Login> getLoginList();

	public void deleteData(String id);

	public Login getLogin(String id);

	public void updateData(Login login);
}
