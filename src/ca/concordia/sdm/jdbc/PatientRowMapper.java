package ca.concordia.sdm.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import ca.concordia.sdm.domain.Patient;

public class PatientRowMapper implements RowMapper<Patient> {

	@Override
	public Patient mapRow(ResultSet resultSet, int line) throws SQLException {
		PatientExtractor patientExtractor = new PatientExtractor();
		return patientExtractor.extractData(resultSet);
	}

}
