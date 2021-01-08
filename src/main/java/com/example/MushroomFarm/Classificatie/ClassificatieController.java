package com.example.MushroomFarm.Classificatie;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

public class ClassificatieController {

	@Autowired
	private ClassificatieService classificatieService;
	
	@RequestMapping("/classificatie/toevoegen")
    public String showNewProductPage(Model model) {
        Classificatie classificatie = new Classificatie();
        model.addAttribute("classificatie", classificatie);

        return "ClassificatieToevoegen";
    }

	@RequestMapping(value = "/classificatie/save", method = RequestMethod.POST)
	public String saveClassificatie(@RequestParam("champignonID") Integer champignonID,
			@RequestParam("champignonSoort") String champignonSoort,
            @RequestParam("grootte") String grootte,
            @RequestParam("groeitijd") Integer groeitijd,
            @RequestParam("lux") Integer lux,
            @RequestParam("temperatuur") Double temperatuur,
            @RequestParam("luchtvochtigheid") Integer luchtvochtigheid,
            @RequestParam("acceptabel") Boolean acceptabel) {
		Classificatie classificatie = new Classificatie(champignonID, champignonSoort, grootte, groeitijd, lux, temperatuur, luchtvochtigheid, acceptabel);
		classificatieService.save(classificatie);

		return "redirect:/";
	}
	
}
