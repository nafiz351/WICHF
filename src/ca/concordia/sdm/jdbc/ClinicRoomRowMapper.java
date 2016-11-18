package ca.concordia.sdm.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import ca.concordia.sdm.domain.ClinicRoom;

public class ClinicRoomRowMapper implements RowMapper<ClinicRoom> {

	@Override
	public ClinicRoom mapRow(ResultSet resultSet, int line) throws SQLException {
		ClinicRoomExtractor clinicRoomExtractor = new ClinicRoomExtractor();
		return clinicRoomExtractor.extractData(resultSet);
	}

}
