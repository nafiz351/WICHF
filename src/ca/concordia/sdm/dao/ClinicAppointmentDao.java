package ca.concordia.sdm.dao;

import java.util.List;
import ca.concordia.sdm.domain.ClinicAppointment;

public interface ClinicAppointmentDao {
	public void insertData(ClinicAppointment clinicAppointment);

	public List<ClinicAppointment> getClinicAppointmentList();

	public void updateData(ClinicAppointment clinicAppointment);

	public void deleteData(String id);

	public ClinicAppointment getClinicAppointment(String id);

}