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
import ca.concordia.sdm.domain.Admin;
import ca.concordia.sdm.services.AdminService;

@Controller
public class AdminController {

	@Autowired
	AdminService adminService;

	@RequestMapping("/adminRegister")
	public ModelAndView registerAdmin(@ModelAttribute Admin admin) {
		List<String> genderList = new ArrayList<String>();
		genderList.add("male");
		genderList.add("female");
		
		Map<String, List> map = new HashMap<String, List>();
		map.put("genderList", genderList);
		
		return new ModelAndView("adminRegister", "map", map);
	}

	@RequestMapping("/adminInsert")
	public String inserData(@ModelAttribute Admin admin) {
		if (admin != null)
			adminService.insertData(admin);
		return "redirect:/getAdminList";
	}

	@RequestMapping("/getAdminList")
	public ModelAndView getAdminLIst() {
		List<Admin> adminList = adminService.getAdminList();
		return new ModelAndView("adminList", "adminList", adminList);
	}

	@RequestMapping("/adminEdit")
	public ModelAndView editAdmin(@RequestParam String id,
			@ModelAttribute Admin admin) {

		admin = adminService.getAdmin(id);

		List<String> genderList = new ArrayList<String>();
		genderList.add("male");
		genderList.add("female");

		

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("genderList", genderList);
		
		map.put("admin", admin);

		return new ModelAndView("adminEdit", "map", map);

	}

	@RequestMapping("/adminUpdate")
	public String updateAdmin(@ModelAttribute Admin admin) {
		adminService.updateData(admin);
		return "redirect:/getAdminList";

	}

	@RequestMapping("/adminDelete")
	public String deleteAdmin(@RequestParam String id) {
		System.out.println("id = " + id);
		adminService.deleteData(id);
		return "redirect:/getAdminList";
	}


}
	
	