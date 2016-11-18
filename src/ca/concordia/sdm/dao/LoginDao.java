package ca.concordia.sdm.dao;

import java.util.List;
import ca.concordia.sdm.domain.Login;

public interface LoginDao {
	public void insertData(Login login);

	public List<Login> getLoginList();

	public void updateData(Login login);

	public void deleteData(String id);

	public Login getLogin(String id);

}