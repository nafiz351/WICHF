package ca.concordia.sdm.services;


import java.util.List;

import ca.concordia.sdm.domain.Patient;

public interface PatientService {
	public void insertData(Patient patient);

	public List<Patient> getPatientList();

	public void deleteData(String id);

	public Patient getPatient(String id);

	public void updateData(Patient patient);
}
