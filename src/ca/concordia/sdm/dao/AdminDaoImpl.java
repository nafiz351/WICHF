package ca.concordia.sdm.dao;

import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import ca.concordia.sdm.domain.Admin;
import ca.concordia.sdm.jdbc.AdminRowMapper;

public class AdminDaoImpl implements AdminDao {

	@Autowired
	DataSource dataSource;

	public void insertData(Admin admin) {

		String sql = "INSERT INTO admin "
				+ "(name,address, gender, birthdate,email,phone) VALUES (?, ?, ?, ?, ?, ?)";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(
				sql,
				new Object[] { admin.getAdminName(), admin.getAdminAddress(),
						admin.getAdminGender(),admin.getAdminBirthDate(),
						admin.getAdminEmail(),admin.getAdminPhone()});

	}

	public List<Admin> getAdminList() {
		List adminList = new ArrayList();

		String sql = "select * from admin";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		adminList = jdbcTemplate.query(sql, new AdminRowMapper());
		return adminList;
	}

	@Override
	public void deleteData(String id) {
		String sql = "delete from admin where admin_id=" + id;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sql);

	}

	@Override
	public void updateData(Admin admin) {

		String sql = "UPDATE admin set name = ?,address = ?, gender = ?, birthdate = ?, " +
				     "email =  ?,  phone = ?" +
				     "where admin_id = ?";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(
				sql,
				new Object[] { admin.getAdminName(), admin.getAdminAddress(),
						admin.getAdminGender(),admin.getAdminBirthDate(),
						admin.getAdminEmail(),admin.getAdminPhone(),admin.getAdminId()});

	}

	@Override
	public Admin getAdmin(String id) {
		List<Admin> adminList = new ArrayList<Admin>();
		String sql = "select * from admin where admin_id= " + id;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		adminList = jdbcTemplate.query(sql, new AdminRowMapper());
		return adminList.get(0);
	}

}
