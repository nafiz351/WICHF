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
import ca.concordia.sdm.domain.Login;
import ca.concordia.sdm.services.LoginService;

@Controller
public class loginController {

	@Autowired
	LoginService loginService;

	@RequestMapping("/loginRegister")
	public ModelAndView registerLogin(@ModelAttribute Login login) {
		
		Map<String, List> map = new HashMap<String, List>();
		
		return new ModelAndView("loginRegister", "map", map);
	}

	@RequestMapping("/loginInsert")
	public String inserData(@ModelAttribute Login login) {
		if (login != null)
			loginService.insertData(login);
		return "redirect:/getLoginList";
	}

	@RequestMapping("/getLoginList")
	public ModelAndView getLoginLIst() {
		List<Login> loginList = loginService.getLoginList();
		return new ModelAndView("loginList", "loginList", loginList);
	}

	@RequestMapping("/loginEdit")
	public ModelAndView editLogin(@RequestParam String id,
			@ModelAttribute Login login) {

		login = loginService.getLogin(id);


		Map<String, Object> map = new HashMap<String, Object>();
		map.put("login", login);

		return new ModelAndView("loginEdit", "map", map);

	}

	@RequestMapping("/loginUpdate")
	public String updateLogin(@ModelAttribute Login login) {
		loginService.updateData(login);
		return "redirect:/getLoginList";

	}

	@RequestMapping("/loginDelete")
	public String deleteLogin(@RequestParam String id) {
		System.out.println("id = " + id);
		loginService.deleteData(id);
		return "redirect:/getLoginList";
	}


}
	
	