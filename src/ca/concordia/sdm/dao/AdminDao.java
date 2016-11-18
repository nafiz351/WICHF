package ca.concordia.sdm.dao;

import java.util.List;
import ca.concordia.sdm.domain.Admin;

public interface AdminDao {
	public void insertData(Admin admin);

	public List<Admin> getAdminList();

	public void updateData(Admin admin);

	public void deleteData(String id);

	public Admin getAdmin(String id);

}