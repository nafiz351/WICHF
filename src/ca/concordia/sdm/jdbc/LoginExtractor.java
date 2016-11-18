package ca.concordia.sdm.jdbc;



import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import ca.concordia.sdm.domain.Login;

public class LoginExtractor implements ResultSetExtractor<Login> {

	public Login extractData(ResultSet resultSet) throws SQLException,
			DataAccessException {
		
		Login login = new Login();
		
		login.setLoginId(resultSet.getInt(1));
		login.setLoginName(resultSet.getString(2));
		login.setLoginPassword(resultSet.getString(3));
		login.setLoginType(resultSet.getString(4));
		
		return login;
	}

}