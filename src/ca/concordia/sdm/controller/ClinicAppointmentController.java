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
import ca.concordia.sdm.domain.ClinicAppointment;
import ca.concordia.sdm.services.ClinicAppointmentService;

@Controller
public class ClinicAppointmentController {

	@Autowired
	ClinicAppointmentService clinicAppointmentService;

	@RequestMapping("/clinicAppointmentRegister")
	public ModelAndView registerClinicAppointment(@ModelAttribute ClinicAppointment clinicAppointment) {
		List<String> appointmentList = new ArrayList<String>();
		
		
		Map<String, List> map = new HashMap<String, List>();
		
		return new ModelAndView("clinicAppointmentRegister", "map", map);
	}

	@RequestMapping("/clinicAppointmentInsert")
	public String inserData(@ModelAttribute ClinicAppointment clinicAppointment) {
		if (clinicAppointment != null)
			clinicAppointmentService.insertData(clinicAppointment);
		return "redirect:/getClinicAppointmentList";
	}

	@RequestMapping("/getClinicAppointmentList")
	public ModelAndView getClinicAppointmentLIst() {
		List<ClinicAppointment> clinicAppointmentList = clinicAppointmentService.getClinicAppointmentList();
		return new ModelAndView("clinicAppointmentList", "clinicAppointmentList", clinicAppointmentList);
	}

	@RequestMapping("/clinicAppointmentEdit")
	public ModelAndView editClinicAppointment(@RequestParam String id,
			@ModelAttribute ClinicAppointment clinicAppointment) {

		clinicAppointment = clinicAppointmentService.getClinicAppointment(id);


		List<String> appoinmentList = new ArrayList<String>();
		appoinmentList.add("Annual Checkup");
		appoinmentList.add("Drop-in Visit");
		

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("appoinmentList", appoinmentList);
		
		map.put("clinicAppointment", clinicAppointment);

		return new ModelAndView("clinicAppointmentEdit", "map", map);

	}

	@RequestMapping("/clinicAppointmentUpdate")
	public String updateClinicAppointment(@ModelAttribute ClinicAppointment clinicAppointment) {
		clinicAppointmentService.updateData(clinicAppointment);
		return "redirect:/getClinicAppointmentList";

	}

	@RequestMapping("/clinicAppointmentDelete")
	public String deleteClinicAppointment(@RequestParam String id) {
		System.out.println("id = " + id);
		clinicAppointmentService.deleteData(id);
		return "redirect:/getClinicAppointmentList";
	}


}
	
	