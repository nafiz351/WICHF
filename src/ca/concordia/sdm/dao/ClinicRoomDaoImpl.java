package ca.concordia.sdm.dao;

import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import ca.concordia.sdm.domain.ClinicRoom;

import ca.concordia.sdm.jdbc.ClinicRoomRowMapper;


public class ClinicRoomDaoImpl implements ClinicRoomDao {

	@Autowired
	DataSource dataSource;

	public void insertData(ClinicRoom clinicRoom) {

		String sql = "INSERT INTO clinic_room "
				+ "(room_no,room_phone_ext, room_description) VALUES (?, ?, ?)";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(
				sql,
				new Object[] { clinicRoom.getClinicRoomNumber(), clinicRoom.getClinicRoomPhoneExt(),
						clinicRoom.getClinicRoomDescription()});

	}

	public List<ClinicRoom> getClinicRoomList() {
		List clinicRoomList = new ArrayList();

		String sql = "select * from clinic_room";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		clinicRoomList = jdbcTemplate.query(sql, new ClinicRoomRowMapper());
		return clinicRoomList;
	}

	@Override
	public void deleteData(String id) {
		String sql = "delete from clinic_room where clinic_room_id=" + id;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sql);

	}

	@Override
	public void updateData(ClinicRoom clinicRoom) {

		String sql = "UPDATE clinic_room set room_no = ?,room_phone_ext = ?, room_description = ?" +
				     "where clinic_room_id = ?";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(
				sql,
				new Object[] { clinicRoom.getClinicRoomNumber(), clinicRoom.getClinicRoomPhoneExt(),
						clinicRoom.getClinicRoomDescription(),clinicRoom.getClinicRoomId()});

	}

	@Override
	public ClinicRoom getClinicRoom(String id) {
		List<ClinicRoom> clinicRoomList = new ArrayList<ClinicRoom>();
		String sql = "select * from clinic_room where clinic_room_id= " + id;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		clinicRoomList = jdbcTemplate.query(sql, new ClinicRoomRowMapper());
		return clinicRoomList.get(0);
	}

}
