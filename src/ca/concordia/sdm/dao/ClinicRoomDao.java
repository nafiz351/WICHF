package ca.concordia.sdm.dao;

import java.util.List;
import ca.concordia.sdm.domain.ClinicRoom;

public interface ClinicRoomDao {
	public void insertData(ClinicRoom clinicRoom);

	public List<ClinicRoom> getClinicRoomList();

	public void updateData(ClinicRoom clinicRoom);

	public void deleteData(String id);

	public ClinicRoom getClinicRoom(String id);

}