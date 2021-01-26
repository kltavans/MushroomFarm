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

import com.example.MushroomFarm.ChampignonProfiel.ChampignonProfiel;

@Controller
public class DevicesController {
	
	@Autowired
	private DevicesService deviceService;
	
	@RequestMapping("/device/toevoegen")
    public String showNewProductPage(Model model) {
        Device device = new Device();
        model.addAttribute("device", device);

        return "deviceToevoegen";
    }

	@RequestMapping(value = "/device/save", method = RequestMethod.POST)
	public String saveDevice(@RequestParam("device_id") String device_id,
			@RequestParam("device_naam") String device_naam,
            @RequestParam("sectornaam") String sectornaam) {
		Device device = new Device(device_id, device_naam, sectornaam);
		deviceService.save(device);

		return "redirect:/device";
	}
	
	@RequestMapping("/devices")
    public String viewAllDevices(Model model) {
		List<Device> listDevices = deviceService.listAll();
	    model.addAttribute("listDevices", listDevices);

	    return "devices";
    }

}