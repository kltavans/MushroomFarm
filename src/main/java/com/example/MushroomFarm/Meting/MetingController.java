package com.example.MushroomFarm.Meting;

import java.sql.Date;
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
public class MetingController {
	@Autowired
	private MetingService metingService;
	
	//De pagina om de metingen op te halen
		@RequestMapping("/meting")
	    public String viewAllMetingen(Model model) {
			List<Meting> listMetingen = metingService.listAll();
		    model.addAttribute("listMetingen", listMetingen);

		    return "metingen";
	    }
	
	@RequestMapping("/meting/toevoegen")
    public String showNewProductPage(Model model) {
        Meting meting = new Meting();
        model.addAttribute("meting", meting);

        return "MetingToevoegen";
    }

	@RequestMapping(value = "/meting/save", method = RequestMethod.POST)
	public String saveMeting(@RequestParam("meting_id") int meting_id,
            @RequestParam("device_id") String device_id,
            @RequestParam("datum") Date datum,
            @RequestParam("lux") int lux,
            @RequestParam("temperatuur") Double temperatuur,
            @RequestParam("luchtvochtigheid") int luchtvochtigheid) {
		Meting meting = new Meting(meting_id, device_id, datum, lux, temperatuur, luchtvochtigheid);
		metingService.save(meting);

		return "redirect:/";
	}
}
