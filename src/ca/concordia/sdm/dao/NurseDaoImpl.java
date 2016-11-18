package ca.concordia.sdm.dao;

import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import ca.concordia.sdm.domain.Nurse;
import ca.concordia.sdm.jdbc.NurseRowMapper;

public class NurseDaoImpl implements NurseDao {

	@Autowired
	DataSource dataSource;

	public void insertData(Nurse nurse) {

		String sql = "INSERT INTO nurse "
				+ "(name,address, gender, birthdate,email, registration,phone) VALUES (?, ?, ?,?, ?, ?,?)";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(
				sql,
				new Object[] { nurse.getNurseName(), nurse.getNurseAddress(),
						nurse.getNurseGender(),nurse.getNurseBirthDate(),
						nurse.getNurseEmail(),nurse.getNurseRegNo(),
						nurse.getNursePhone()});

	}

	public List<Nurse> getNurseList() {
		List nurseList = new ArrayList();

		String sql = "select * from nurse";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		nurseList = jdbcTemplate.query(sql, new NurseRowMapper());
		return nurseList;
	}

	@Override
	public void deleteData(String id) {
		String sql = "delete from nurse where nurse_id=" + id;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sql);

	}

	@Override
	public void updateData(Nurse nurse) {

		String sql = "UPDATE nurse set name = ?,address = ?, gender = ?, birthdate = ?, " +
				     "email =  ?, registration = ?, phone = ?" +
				     "where nurse_id = ?";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(
				sql,
				new Object[] { nurse.getNurseName(), nurse.getNurseAddress(),
						nurse.getNurseGender(),nurse.getNurseBirthDate(),
						nurse.getNurseEmail(),nurse.getNurseRegNo(),
						nurse.getNursePhone(),nurse.getNurseId()});

	}

	@Override
	public Nurse getNurse(String id) {
		List<Nurse> nurseList = new ArrayList<Nurse>();
		String sql = "select * from nurse where nurse_id= " + id;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		nurseList = jdbcTemplate.query(sql, new NurseRowMapper());
		return nurseList.get(0);
	}

}
