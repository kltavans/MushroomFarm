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

@Controller
public class DevicesController {
	
	@Autowired
	private DevicesService deviceService;
	
	@RequestMapping("/device/toevoegen")
    public String showNewProductPage(Model model) {
        Device device = new Device();
        model.addAttribute("device", device);

        return "DeviceToevoegen";
    }

	@RequestMapping(value = "/device/save", method = RequestMethod.POST)
	public String saveDevice(@RequestParam("device_naam") String device_naam,
            @RequestParam("sector_naam") String sector_naam) {
		Device device = new Device(device_naam, sector_naam);
		deviceService.save(device);

		return "redirect:/";
	}
	
	@RequestMapping("/device/aanpassen")
	public String showNewGebruikerAanpassen(Model model) {
		Device device = new Device();
		model.addAttribute("device", device);
		
		return "DeviceAanpassen";
	}
	
	@RequestMapping("/device")
    public String viewAllDevices(Model model) {
		List<Device> listDevices = deviceService.listAll();
	    model.addAttribute("listDevices", listDevices);

	    return "Devices";
    }

}