package ca.concordia.sdm.services;


import java.util.List;

import ca.concordia.sdm.domain.Admin;

public interface AdminService {
	public void insertData(Admin admin);

	public List<Admin> getAdminList();

	public void deleteData(String id);

	public Admin getAdmin(String id);

	public void updateData(Admin admin);
}
