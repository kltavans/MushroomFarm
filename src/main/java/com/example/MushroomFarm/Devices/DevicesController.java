package com.example.MushroomFarm.Devices;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

public class DevicesController {
	
	@Autowired
	private DevicesService deviceService;
	
	@RequestMapping("/device/toevoegen")
    public String showNewProductPage(Model model) {
        Device device = new Device();
        model.addAttribute("device", device);

        return "ChampignonProfielToevoegen";
    }

	@RequestMapping(value = "/device/save", method = RequestMethod.POST)
	public String saveDevice(@RequestParam("deviceNaam") String deviceNaam,
            @RequestParam("sectorNaam") String sectorNaam) {
		Device device = new Device(deviceNaam, sectorNaam);
		deviceService.save(device);

		return "redirect:/";
	}

}