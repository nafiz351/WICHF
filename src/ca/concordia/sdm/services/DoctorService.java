package ca.concordia.sdm.services;


import java.util.List;

import ca.concordia.sdm.domain.Doctor;

public interface DoctorService {
	public void insertData(Doctor doctor);

	public List<Doctor> getDoctorList();

	public void deleteData(String id);

	public Doctor getDoctor(String id);

	public void updateData(Doctor doctor);
}
