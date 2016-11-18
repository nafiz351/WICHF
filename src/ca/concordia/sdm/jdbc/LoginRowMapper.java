package ca.concordia.sdm.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import ca.concordia.sdm.domain.Login;

public class LoginRowMapper implements RowMapper<Login> {

	@Override
	public Login mapRow(ResultSet resultSet, int line) throws SQLException {
		LoginExtractor loginExtractor = new LoginExtractor();
		return loginExtractor.extractData(resultSet);
	}

}
