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
import ca.concordia.sdm.domain.Patient;
import ca.concordia.sdm.services.PatientService;

@Controller
public class PatientController {

	@Autowired
	PatientService patientService;

	@RequestMapping("/patientRegister")
	public ModelAndView registerPatient(@ModelAttribute Patient patient) {
		List<String> genderList = new ArrayList<String>();
		genderList.add("male");
		genderList.add("female");
		
		Map<String, List> map = new HashMap<String, List>();
		map.put("genderList", genderList);
		
		return new ModelAndView("patientRegister", "map", map);
	}

	@RequestMapping("/patientInsert")
	public String inserData(@ModelAttribute Patient patient) {
		if (patient != null)
			patientService.insertData(patient);
		return "redirect:/getPatientList";
	}

	@RequestMapping("/getPatientList")
	public ModelAndView getPatientLIst() {
		List<Patient> patientList = patientService.getPatientList();
		return new ModelAndView("patientList", "patientList", patientList);
	}

	@RequestMapping("/patientEdit")
	public ModelAndView editPatient(@RequestParam String id,
			@ModelAttribute Patient patient) {

		patient = patientService.getPatient(id);

		List<String> genderList = new ArrayList<String>();
		genderList.add("male");
		genderList.add("female");

		

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("genderList", genderList);
		
		map.put("patient", patient);

		return new ModelAndView("patientEdit", "map", map);

	}

	@RequestMapping("/patientUpdate")
	public String updatePatient(@ModelAttribute Patient patient) {
		patientService.updateData(patient);
		return "redirect:/getPatientList";

	}

	@RequestMapping("/patientDelete")
	public String deletePatient(@RequestParam String id) {
		System.out.println("id = " + id);
		patientService.deleteData(id);
		return "redirect:/getPatientList";
	}


}
	
	