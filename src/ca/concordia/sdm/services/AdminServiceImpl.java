package ca.concordia.sdm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import ca.concordia.sdm.dao.AdminDao;
import ca.concordia.sdm.domain.Admin;


public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminDao adminDao;

	@Override
	public void insertData(Admin admin) {
		adminDao.insertData(admin);
	}

	@Override
	public List<Admin> getAdminList() {
		return adminDao.getAdminList();
	}

	@Override
	public void deleteData(String id) {
		adminDao.deleteData(id);
		
	}

	@Override
	public Admin getAdmin(String id) {
		return adminDao.getAdmin(id);
	}

	@Override
	public void updateData(Admin admin) {
		adminDao.updateData(admin);
		
	}


	
}
