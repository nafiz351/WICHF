package ca.concordia.sdm.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import ca.concordia.sdm.domain.Admin;

public class AdminRowMapper implements RowMapper<Admin> {

	@Override
	public Admin mapRow(ResultSet resultSet, int line) throws SQLException {
		AdminExtractor adminExtractor = new AdminExtractor();
		return adminExtractor.extractData(resultSet);
	}

}
