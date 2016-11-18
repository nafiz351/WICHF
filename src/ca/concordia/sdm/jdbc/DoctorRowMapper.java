package ca.concordia.sdm.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import ca.concordia.sdm.domain.Doctor;

public class DoctorRowMapper implements RowMapper<Doctor> {

	@Override
	public Doctor mapRow(ResultSet resultSet, int line) throws SQLException {
		DoctorExtractor doctorExtractor = new DoctorExtractor();
		return doctorExtractor.extractData(resultSet);
	}

}
