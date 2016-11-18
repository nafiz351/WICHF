package ca.concordia.sdm.dao;

import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import ca.concordia.sdm.domain.Login;

import ca.concordia.sdm.jdbc.LoginRowMapper;


public class LoginDaoImpl implements LoginDao {

	@Autowired
	DataSource dataSource;

	public void insertData(Login login) {

		String sql = "INSERT INTO login "
				+ "(login_name,login_password, login_type) VALUES (?, ?, ?)";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(
				sql,
				new Object[] { login.getLoginName(), login.getLoginPassword(),
						login.getLoginType()});

	}

	public List<Login> getLoginList() {
		List loginList = new ArrayList();

		String sql = "select * from login";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		loginList = jdbcTemplate.query(sql, new LoginRowMapper());
		return loginList;
	}

	@Override
	public void deleteData(String id) {
		String sql = "delete from login where login_id=" + id;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sql);

	}

	@Override
	public void updateData(Login login) {

		String sql = "UPDATE login set login_name = ?,login_password = ?, login_type = ?" +
				     "where login_id = ?";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(
				sql,
				new Object[] { login.getLoginName(), login.getLoginPassword(),
						login.getLoginType(),login.getLoginId()});

	}

	@Override
	public Login getLogin(String id) {
		List<Login> loginList = new ArrayList<Login>();
		String sql = "select * from login where login_id= " + id;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		loginList = jdbcTemplate.query(sql, new LoginRowMapper());
		return loginList.get(0);
	}

}
