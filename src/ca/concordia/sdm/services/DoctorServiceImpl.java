package ca.concordia.sdm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import ca.concordia.sdm.dao.DoctorDao;
import ca.concordia.sdm.domain.Doctor;


public class DoctorServiceImpl implements DoctorService {

	@Autowired
	DoctorDao doctorDao;

	@Override
	public void insertData(Doctor doctor) {
		doctorDao.insertData(doctor);
	}

	@Override
	public List<Doctor> getDoctorList() {
		return doctorDao.getDoctorList();
	}

	@Override
	public void deleteData(String id) {
		doctorDao.deleteData(id);
		
	}

	@Override
	public Doctor getDoctor(String id) {
		return doctorDao.getDoctor(id);
	}

	@Override
	public void updateData(Doctor doctor) {
		doctorDao.updateData(doctor);
		
	}


	
}
