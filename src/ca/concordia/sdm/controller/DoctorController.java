package ca.concordia.sdm.controller;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ca.concordia.sdm.domain.Doctor;
import ca.concordia.sdm.services.DoctorService;

@Controller
public class DoctorController {

	@Autowired
	DoctorService doctorService;

	@RequestMapping("/doctorRegister")
	public ModelAndView registerDoctor(@ModelAttribute Doctor doctor) {
		List<String> genderList = new ArrayList<String>();
		genderList.add("male");
		genderList.add("female");
		
		Map<String, List> map = new HashMap<String, List>();
		map.put("genderList", genderList);
		
		return new ModelAndView("doctorRegister", "map", map);
	}

	@RequestMapping("/doctorInsert")
	public String inserData(@ModelAttribute Doctor doctor) {
		if (doctor != null)
			doctorService.insertData(doctor);
		return "redirect:/getDoctorList";
	}

	@RequestMapping("/getDoctorList")
	public ModelAndView getDoctorLIst() {
		List<Doctor> doctorList = doctorService.getDoctorList();
		return new ModelAndView("doctorList", "doctorList", doctorList);
	}

	@RequestMapping("/doctorEdit")
	public ModelAndView editDoctor(@RequestParam String id,
			@ModelAttribute Doctor doctor) {

		doctor = doctorService.getDoctor(id);

		List<String> genderList = new ArrayList<String>();
		genderList.add("male");
		genderList.add("female");

		

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("genderList", genderList);
		
		map.put("doctor", doctor);

		return new ModelAndView("doctorEdit", "map", map);

	}

	@RequestMapping("/doctorUpdate")
	public String updateDoctor(@ModelAttribute Doctor doctor) {
		doctorService.updateData(doctor);
		return "redirect:/getDoctorList";

	}

	@RequestMapping("/doctorDelete")
	public String deleteDoctor(@RequestParam String id) {
		System.out.println("id = " + id);
		doctorService.deleteData(id);
		return "redirect:/getDoctorList";
	}


}
	
	