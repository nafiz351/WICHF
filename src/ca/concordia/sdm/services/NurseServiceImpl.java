package ca.concordia.sdm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import ca.concordia.sdm.dao.NurseDao;
import ca.concordia.sdm.domain.Nurse;


public class NurseServiceImpl implements NurseService {

	@Autowired
	NurseDao nursedao;

	@Override
	public void insertData(Nurse doctor) {
		nursedao.insertData(doctor);
	}

	@Override
	public List<Nurse> getNurseList() {
		return nursedao.getNurseList();
	}

	@Override
	public void deleteData(String id) {
		nursedao.deleteData(id);
		
	}

	@Override
	public Nurse getNurse(String id) {
		return nursedao.getNurse(id);
	}

	@Override
	public void updateData(Nurse doctor) {
		nursedao.updateData(doctor);
		
	}


	
}
