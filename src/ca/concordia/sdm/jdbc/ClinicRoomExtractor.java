package ca.concordia.sdm.jdbc;



import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import ca.concordia.sdm.domain.ClinicRoom;

public class ClinicRoomExtractor implements ResultSetExtractor<ClinicRoom> {

	public ClinicRoom extractData(ResultSet resultSet) throws SQLException,
			DataAccessException {
		
		ClinicRoom clinicRoom = new ClinicRoom();
		
		clinicRoom.setClinicRoomId(resultSet.getInt(1));
		clinicRoom.setClinicRoomNumber(resultSet.getString(2));
		clinicRoom.setClinicRoomPhoneExt(resultSet.getString(3));
		clinicRoom.setClinicRoomDescription(resultSet.getString(4));
		
		return clinicRoom;
	}

}