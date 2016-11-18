package ca.concordia.sdm.jdbc;



import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import ca.concordia.sdm.domain.Patient;

public class PatientExtractor implements ResultSetExtractor<Patient> {

	public Patient extractData(ResultSet resultSet) throws SQLException,
			DataAccessException {
		
		Patient patient = new Patient();
		
		
		
		
		patient.setPatientId(resultSet.getInt(1));
		patient.setPatientName(resultSet.getString(2));
		patient.setPatientAddress(resultSet.getString(3));
		patient.setPatientGender(resultSet.getString(4));
		patient.setPatientBirthDate(resultSet.getString(5));
		patient.setPatientEmail(resultSet.getString(6));
		patient.setPatientHealthCardNo(resultSet.getString(7));
		patient.setPatientPhone(resultSet.getString(8));
		
		return patient;
	}

}