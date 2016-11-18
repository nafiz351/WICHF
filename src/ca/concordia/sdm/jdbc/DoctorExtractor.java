package ca.concordia.sdm.jdbc;



import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import ca.concordia.sdm.domain.Doctor;

public class DoctorExtractor implements ResultSetExtractor<Doctor> {

	public Doctor extractData(ResultSet resultSet) throws SQLException,
			DataAccessException {
		
		Doctor doctor = new Doctor();
		
		doctor.setDoctorId(resultSet.getInt(1));
		doctor.setDoctorName(resultSet.getString(2));
		doctor.setDoctorAddress(resultSet.getString(3));
		doctor.setDoctorGender(resultSet.getString(4));
		doctor.setDoctorBirthDate(resultSet.getString(5));
		doctor.setDoctorEmail(resultSet.getString(6));
		doctor.setDoctorRegNo(resultSet.getString(7));
		doctor.setDoctorPhone(resultSet.getString(8));
		
		return doctor;
	}

}