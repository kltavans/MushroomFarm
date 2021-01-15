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

        return "DeviceToevoegen";
    }

	@RequestMapping(value = "/device/save", method = RequestMethod.POST)
	public String saveDevice(@RequestParam("device_id") String device_id,
			@RequestParam("device_naam") String device_naam,
            @RequestParam("sectornaam") String sectornaam) {
		Device device = new Device(device_id, device_naam, sectornaam);
		deviceService.save(device);

		return "redirect:/device";
	}
	
	//Naar pagina om aan te passen
	@RequestMapping("/device/{device_id}/aanpassen")
    public ModelAndView showDeviceAanpassenPage(@PathVariable(name = "device_id") String device_id) {
        ModelAndView mav = new ModelAndView("deviceAanpassen");
        Device device = deviceService.get(device_id);
        mav.addObject("device", device);

        return mav;
    }
	
	//Om aanpassingen op te slaan
	@RequestMapping(value = "/device/{device_id}/aanpassen/save", method = RequestMethod.POST)
    public String deviceAanpassen(@RequestParam("device_id") String device_id, 
    		@RequestParam("device_naam") String device_naam,
            @RequestParam("sectornaam") String sectornaam) {
		deviceService.deviceAanpassen(device_id, device_naam, sectornaam);

        return "redirect:/device";
    }
	
	@RequestMapping("/device")
    public String viewAllDevices(Model model) {
		List<Device> listDevices = deviceService.listAll();
	    model.addAttribute("listDevices", listDevices);

	    return "Devices";
    }

}