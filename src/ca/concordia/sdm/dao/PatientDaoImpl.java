package ca.concordia.sdm.dao;

import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import ca.concordia.sdm.domain.Patient;
import ca.concordia.sdm.jdbc.PatientRowMapper;

public class PatientDaoImpl implements PatientDao {

	@Autowired
	DataSource dataSource;

	public void insertData(Patient patient) {

		String sql = "INSERT INTO patient "
				+ "(name,address, gender, birthdate,email, health_card_no,phone) VALUES (?, ?, ?,?, ?, ?,?)";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(
				sql,
				new Object[] { patient.getPatientName(), patient.getPatientAddress(),
						patient.getPatientGender(),patient.getPatientBirthDate(),
						patient.getPatientEmail(),patient.getPatientHealthCardNo(),
						patient.getPatientPhone()});

	}

	public List<Patient> getPatientList() {
		List patientList = new ArrayList();

		String sql = "select * from patient";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		patientList = jdbcTemplate.query(sql, new PatientRowMapper());
		return patientList;
	}

	@Override
	public void deleteData(String id) {
		String sql = "delete from patient where patient_id=" + id;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sql);

	}

	@Override
	public void updateData(Patient patient) {

		String sql = "UPDATE patient set name = ?,address = ?, gender = ?, birthdate = ?, " +
				     "email =  ?, health_card_no = ?, phone = ?" +
				     "where patient_id = ?";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(
				sql,
				new Object[] { patient.getPatientName(), patient.getPatientAddress(),
						patient.getPatientGender(),patient.getPatientBirthDate(),
						patient.getPatientEmail(),patient.getPatientHealthCardNo(),
						patient.getPatientPhone(),patient.getPatientId()});

	}

	@Override
	public Patient getPatient(String id) {
		List<Patient> patientList = new ArrayList<Patient>();
		String sql = "select * from patient where patient_id= " + id;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		patientList = jdbcTemplate.query(sql, new PatientRowMapper());
		return patientList.get(0);
	}

}
