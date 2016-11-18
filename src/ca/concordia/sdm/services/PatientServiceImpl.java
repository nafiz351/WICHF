package ca.concordia.sdm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import ca.concordia.sdm.dao.PatientDao;
import ca.concordia.sdm.domain.Patient;


public class PatientServiceImpl implements PatientService {

	@Autowired
	PatientDao patientDao;

	@Override
	public void insertData(Patient patient) {
		patientDao.insertData(patient);
	}

	@Override
	public List<Patient> getPatientList() {
		return patientDao.getPatientList();
	}

	@Override
	public void deleteData(String id) {
		patientDao.deleteData(id);
		
	}

	@Override
	public Patient getPatient(String id) {
		return patientDao.getPatient(id);
	}

	@Override
	public void updateData(Patient patient) {
		patientDao.updateData(patient);
		
	}


	
}
