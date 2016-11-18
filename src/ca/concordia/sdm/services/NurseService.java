package ca.concordia.sdm.services;


import java.util.List;

import ca.concordia.sdm.domain.Nurse;

public interface NurseService {
	public void insertData(Nurse nurse);

	public List<Nurse> getNurseList();

	public void deleteData(String id);

	public Nurse getNurse(String id);

	public void updateData(Nurse nurse);
}
