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
import ca.concordia.sdm.domain.ClinicRoom;
import ca.concordia.sdm.services.ClinicRoomService;

@Controller
public class ClinicRoomController {

	@Autowired
	ClinicRoomService clinicRoomService;

	@RequestMapping("/clinicRoomRegister")
	public ModelAndView registerClinicRoom(@ModelAttribute ClinicRoom clinicRoom) {
		
		Map<String, List> map = new HashMap<String, List>();
		
		return new ModelAndView("clinicRoomRegister", "map", map);
	}

	@RequestMapping("/clinicRoomInsert")
	public String inserData(@ModelAttribute ClinicRoom clinicRoom) {
		if (clinicRoom != null)
			clinicRoomService.insertData(clinicRoom);
		return "redirect:/getClinicRoomList";
	}

	@RequestMapping("/getClinicRoomList")
	public ModelAndView getClinicRoomLIst() {
		List<ClinicRoom> clinicRoomList = clinicRoomService.getClinicRoomList();
		return new ModelAndView("clinicRoomList", "clinicRoomList", clinicRoomList);
	}

	@RequestMapping("/clinicRoomEdit")
	public ModelAndView editClinicRoom(@RequestParam String id,
			@ModelAttribute ClinicRoom clinicRoom) {

		clinicRoom = clinicRoomService.getClinicRoom(id);


		Map<String, Object> map = new HashMap<String, Object>();
		map.put("clinicRoom", clinicRoom);

		return new ModelAndView("clinicRoomEdit", "map", map);

	}

	@RequestMapping("/clinicRoomUpdate")
	public String updateClinicRoom(@ModelAttribute ClinicRoom clinicRoom) {
		clinicRoomService.updateData(clinicRoom);
		return "redirect:/getClinicRoomList";

	}

	@RequestMapping("/clinicRoomDelete")
	public String deleteClinicRoom(@RequestParam String id) {
		System.out.println("id = " + id);
		clinicRoomService.deleteData(id);
		return "redirect:/getClinicRoomList";
	}


}
	
	