package ca.concordia.sdm.services;


import java.util.List;

import ca.concordia.sdm.domain.ClinicRoom;

public interface ClinicRoomService {
	public void insertData(ClinicRoom clinicRoom);

	public List<ClinicRoom> getClinicRoomList();

	public void deleteData(String id);

	public ClinicRoom getClinicRoom(String id);

	public void updateData(ClinicRoom clinicRoom);
}
