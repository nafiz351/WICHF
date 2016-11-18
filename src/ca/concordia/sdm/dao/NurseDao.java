package ca.concordia.sdm.dao;

import java.util.List;
import ca.concordia.sdm.domain.Nurse;

public interface NurseDao {
	public void insertData(Nurse doctor);

	public List<Nurse> getNurseList();

	public void updateData(Nurse doctor);

	public void deleteData(String id);

	public Nurse getNurse(String id);

}