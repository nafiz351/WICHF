package ca.concordia.sdm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import ca.concordia.sdm.dao.ClinicRoomDao;
import ca.concordia.sdm.domain.ClinicRoom;


public class ClinicRoomServiceImpl implements ClinicRoomService {

	@Autowired
	ClinicRoomDao clinicRoomDao;

	@Override
	public void insertData(ClinicRoom clinicRoom) {
		clinicRoomDao.insertData(clinicRoom);
	}

	@Override
	public List<ClinicRoom> getClinicRoomList() {
		return clinicRoomDao.getClinicRoomList();
	}

	@Override
	public void deleteData(String id) {
		clinicRoomDao.deleteData(id);
		
	}

	@Override
	public ClinicRoom getClinicRoom(String id) {
		return clinicRoomDao.getClinicRoom(id);
	}

	@Override
	public void updateData(ClinicRoom clinicRoom) {
		clinicRoomDao.updateData(clinicRoom);
		
	}


	
}
