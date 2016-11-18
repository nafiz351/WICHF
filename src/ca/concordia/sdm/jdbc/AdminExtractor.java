package ca.concordia.sdm.jdbc;



import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import ca.concordia.sdm.domain.Admin;

public class AdminExtractor implements ResultSetExtractor<Admin> {

	public Admin extractData(ResultSet resultSet) throws SQLException,
			DataAccessException {
		
		Admin admin = new Admin();
			
		admin.setAdminId(resultSet.getInt(1));
		admin.setAdminName(resultSet.getString(2));
		admin.setAdminAddress(resultSet.getString(3));
		admin.setAdminGender(resultSet.getString(4));
		admin.setAdminBirthDate(resultSet.getString(5));
		admin.setAdminEmail(resultSet.getString(6));
		admin.setAdminPhone(resultSet.getString(7));
		
		return admin;
	}

}