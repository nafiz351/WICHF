package ca.concordia.sdm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import ca.concordia.sdm.dao.LoginDao;
import ca.concordia.sdm.domain.Login;


public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginDao loginDao;

	@Override
	public void insertData(Login login) {
		loginDao.insertData(login);
	}

	@Override
	public List<Login> getLoginList() {
		return loginDao.getLoginList();
	}

	@Override
	public void deleteData(String id) {
		loginDao.deleteData(id);
		
	}

	@Override
	public Login getLogin(String id) {
		return loginDao.getLogin(id);
	}

	@Override
	public void updateData(Login login) {
		loginDao.updateData(login);
		
	}


	
}
