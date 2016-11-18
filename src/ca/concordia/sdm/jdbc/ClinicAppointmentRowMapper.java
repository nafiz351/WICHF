package ca.concordia.sdm.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import ca.concordia.sdm.domain.ClinicAppointment;

public class ClinicAppointmentRowMapper implements RowMapper<ClinicAppointment> {

	@Override
	public ClinicAppointment mapRow(ResultSet resultSet, int line) throws SQLException {
		ClinicAppointmentExtractor clinicAppointmentExtractor = new ClinicAppointmentExtractor();
		return clinicAppointmentExtractor.extractData(resultSet);
	}

}
