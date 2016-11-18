package ca.concordia.sdm.dao;

import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import ca.concordia.sdm.domain.ClinicAppointment;

import ca.concordia.sdm.jdbc.ClinicAppointmentRowMapper;


public class ClinicAppointmentDaoImpl implements ClinicAppointmentDao {

	@Autowired
	DataSource dataSource;

	public void insertData(ClinicAppointment clinicAppointment) {

		String sql = "INSERT INTO clinic_appointment "
				+ "(appointment_type,appointment_time_slot) VALUES (?, ?)";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(
				sql,
				new Object[] { clinicAppointment.getClinicAppointmentType(), 
						clinicAppointment.getClinicAppointmentTimeSlot()});

	}

	public List<ClinicAppointment> getClinicAppointmentList() {
		List clinicAppointmentList = new ArrayList();

		String sql = "select * from clinic_appointment";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		clinicAppointmentList = jdbcTemplate.query(sql, new ClinicAppointmentRowMapper());
		return clinicAppointmentList;
	}

	@Override
	public void deleteData(String id) {
		String sql = "delete from clinic_appointment where clinic_appointment_id=" + id;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sql);

	}

	@Override
	public void updateData(ClinicAppointment clinicAppointment) {

		String sql = "UPDATE clinic_appointment set appointment_type = ?, appointment_time_slot = ?" +
				     "where clinic_appointment_id = ?";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(
				sql,
				new Object[] { clinicAppointment.getClinicAppointmentType(), 
						clinicAppointment.getClinicAppointmentTimeSlot(),
						clinicAppointment.getClinicAppointmentId()});

	}

	@Override
	public ClinicAppointment getClinicAppointment(String id) {
		List<ClinicAppointment> clinicAppointmentList = new ArrayList<ClinicAppointment>();
		String sql = "select * from clinic_appointment where clinic_appointment_id= " + id;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		clinicAppointmentList = jdbcTemplate.query(sql, new ClinicAppointmentRowMapper());
		return clinicAppointmentList.get(0);
	}

}
