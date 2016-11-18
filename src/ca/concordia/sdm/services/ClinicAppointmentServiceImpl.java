package ca.concordia.sdm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import ca.concordia.sdm.dao.ClinicAppointmentDao;
import ca.concordia.sdm.domain.ClinicAppointment;


public class ClinicAppointmentServiceImpl implements ClinicAppointmentService {

	@Autowired
	ClinicAppointmentDao clinicAppointmentDao;

	@Override
	public void insertData(ClinicAppointment clinicAppointment) {
		clinicAppointmentDao.insertData(clinicAppointment);
	}

	@Override
	public List<ClinicAppointment> getClinicAppointmentList() {
		return clinicAppointmentDao.getClinicAppointmentList();
	}

	@Override
	public void deleteData(String id) {
		clinicAppointmentDao.deleteData(id);
		
	}

	@Override
	public ClinicAppointment getClinicAppointment(String id) {
		return clinicAppointmentDao.getClinicAppointment(id);
	}

	@Override
	public void updateData(ClinicAppointment clinicAppointment) {
		clinicAppointmentDao.updateData(clinicAppointment);
		
	}


	
}
