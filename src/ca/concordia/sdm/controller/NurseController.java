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
import ca.concordia.sdm.domain.Nurse;
import ca.concordia.sdm.services.NurseService;

@Controller
public class NurseController {

	@Autowired
	NurseService nurseService;

	@RequestMapping("/nurseRegister")
	public ModelAndView registerNurse(@ModelAttribute Nurse nurse) {
		List<String> genderList = new ArrayList<String>();
		genderList.add("male");
		genderList.add("female");
		
		Map<String, List> map = new HashMap<String, List>();
		map.put("genderList", genderList);
		
		return new ModelAndView("nurseRegister", "map", map);
	}

	@RequestMapping("/nurseInsert")
	public String inserData(@ModelAttribute Nurse nurse) {
		if (nurse != null)
			nurseService.insertData(nurse);
		return "redirect:/getNurseList";
	}

	@RequestMapping("/getNurseList")
	public ModelAndView getNurseLIst() {
		List<Nurse> nurseList = nurseService.getNurseList();
		return new ModelAndView("nurseList", "nurseList", nurseList);
	}

	@RequestMapping("/nurseEdit")
	public ModelAndView editNurse(@RequestParam String id,
			@ModelAttribute Nurse nurse) {

		nurse = nurseService.getNurse(id);

		List<String> genderList = new ArrayList<String>();
		genderList.add("male");
		genderList.add("female");

		

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("genderList", genderList);
		
		map.put("nurse", nurse);

		return new ModelAndView("nurseEdit", "map", map);

	}

	@RequestMapping("/nurseUpdate")
	public String updateNurse(@ModelAttribute Nurse nurse) {
		nurseService.updateData(nurse);
		return "redirect:/getNurseList";

	}

	@RequestMapping("/nurseDelete")
	public String deleteNurse(@RequestParam String id) {
		System.out.println("id = " + id);
		nurseService.deleteData(id);
		return "redirect:/getNurseList";
	}


}
	
	