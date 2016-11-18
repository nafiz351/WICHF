package ca.concordia.sdm.dao;

import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import ca.concordia.sdm.domain.Doctor;
import ca.concordia.sdm.jdbc.DoctorRowMapper;

public class DoctorDaoImpl implements DoctorDao {

	@Autowired
	DataSource dataSource;

	public void insertData(Doctor doctor) {

		String sql = "INSERT INTO doctor "
				+ "(name,address, gender, birthdate,email, registration,phone) VALUES (?, ?, ?,?, ?, ?,?)";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(
				sql,
				new Object[] { doctor.getDoctorName(), doctor.getDoctorAddress(),
						doctor.getDoctorGender(),doctor.getDoctorBirthDate(),
						doctor.getDoctorEmail(),doctor.getDoctorRegNo(),
						doctor.getDoctorPhone()});

	}

	public List<Doctor> getDoctorList() {
		List doctorList = new ArrayList();

		String sql = "select * from doctor";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		doctorList = jdbcTemplate.query(sql, new DoctorRowMapper());
		return doctorList;
	}

	@Override
	public void deleteData(String id) {
		String sql = "delete from doctor where doctor_id=" + id;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sql);

	}

	@Override
	public void updateData(Doctor doctor) {

		String sql = "UPDATE doctor set name = ?,address = ?, gender = ?, birthdate = ?, " +
				     "email =  ?, registration = ?, phone = ?" +
				     "where doctor_id = ?";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(
				sql,
				new Object[] { doctor.getDoctorName(), doctor.getDoctorAddress(),
						doctor.getDoctorGender(),doctor.getDoctorBirthDate(),
						doctor.getDoctorEmail(),doctor.getDoctorRegNo(),
						doctor.getDoctorPhone(),doctor.getDoctorId()});

	}

	@Override
	public Doctor getDoctor(String id) {
		List<Doctor> doctorList = new ArrayList<Doctor>();
		String sql = "select * from doctor where doctor_id= " + id;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		doctorList = jdbcTemplate.query(sql, new DoctorRowMapper());
		return doctorList.get(0);
	}

}
