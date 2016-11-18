package ca.concordia.sdm.jdbc;



import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import ca.concordia.sdm.domain.Nurse;

public class NurseExtractor implements ResultSetExtractor<Nurse> {

	public Nurse extractData(ResultSet resultSet) throws SQLException,
			DataAccessException {
		
		Nurse nurse = new Nurse();
		
		nurse.setNurseId(resultSet.getInt(1));
		nurse.setNurseName(resultSet.getString(2));
		nurse.setNurseAddress(resultSet.getString(3));
		nurse.setNurseGender(resultSet.getString(4));
		nurse.setNurseBirthDate(resultSet.getString(5));
		nurse.setNurseEmail(resultSet.getString(6));
		nurse.setNurseRegNo(resultSet.getString(7));
		nurse.setNursePhone(resultSet.getString(8));
		
		return nurse;
	}

}