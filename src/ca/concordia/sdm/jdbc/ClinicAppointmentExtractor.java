package ca.concordia.sdm.jdbc;



import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import ca.concordia.sdm.domain.ClinicAppointment;

public class ClinicAppointmentExtractor implements ResultSetExtractor<ClinicAppointment> {

	public ClinicAppointment extractData(ResultSet resultSet) throws SQLException,
			DataAccessException {
		
		ClinicAppointment clinicAppointment = new ClinicAppointment();
		
		clinicAppointment.setClinicAppointmentId(resultSet.getInt(1));
		clinicAppointment.setClinicAppointmentType(resultSet.getString(2));
		clinicAppointment.setClinicAppointmentTimeSlot(resultSet.getString(3));
		
		return clinicAppointment;
	}

}