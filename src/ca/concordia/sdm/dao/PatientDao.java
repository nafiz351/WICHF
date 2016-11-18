package ca.concordia.sdm.dao;

import java.util.List;
import ca.concordia.sdm.domain.Patient;

public interface PatientDao {
	public void insertData(Patient patient);

	public List<Patient> getPatientList();

	public void updateData(Patient patient);

	public void deleteData(String id);

	public Patient getPatient(String id);

}