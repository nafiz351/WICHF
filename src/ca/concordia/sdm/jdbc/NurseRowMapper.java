package ca.concordia.sdm.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import ca.concordia.sdm.domain.Nurse;

public class NurseRowMapper implements RowMapper<Nurse> {

	@Override
	public Nurse mapRow(ResultSet resultSet, int line) throws SQLException {
		NurseExtractor nurseExtractor = new NurseExtractor();
		return nurseExtractor.extractData(resultSet);
	}

}
