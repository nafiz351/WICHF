package ca.concordia.sdm.services;


import java.util.List;

import ca.concordia.sdm.domain.ClinicAppointment;

public interface ClinicAppointmentService {
	public void insertData(ClinicAppointment clinicAppointment);

	public List<ClinicAppointment> getClinicAppointmentList();

	public void deleteData(String id);

	public ClinicAppointment getClinicAppointment(String id);

	public void updateData(ClinicAppointment clinicAppointment);
}
