package ca.concordia.sdm.dao;

import java.util.List;
import ca.concordia.sdm.domain.Doctor;

public interface DoctorDao {
	public void insertData(Doctor doctor);

	public List<Doctor> getDoctorList();

	public void updateData(Doctor doctor);

	public void deleteData(String id);

	public Doctor getDoctor(String id);

}