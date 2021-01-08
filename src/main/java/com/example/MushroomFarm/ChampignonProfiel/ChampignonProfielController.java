package com.example.MushroomFarm.ChampignonProfiel;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

public class ChampignonProfielController {
	
	@Autowired
	private ChampignonProfielService champignonProfielService;
	
	@RequestMapping("/champignonprofiel/toevoegen")
    public String showNewProductPage(Model model) {
        ChampignonProfiel champignonProfiel = new ChampignonProfiel();
        model.addAttribute("champignonProfiel", champignonProfiel);

        return "ChampignonProfielToevoegen";
    }

	@RequestMapping(value = "/champignonprofiel/save", method = RequestMethod.POST)
	public String saveChampignonProfiel(@RequestParam("champignonSoort") String champignonSoort,
            @RequestParam("grootte") String grootte,
            @RequestParam("groeitijd") String groeitijd,
            @RequestParam("lux") Integer lux,
            @RequestParam("temperatuur") Double temperatuur,
            @RequestParam("luchtvochtigheid") Integer luchtvochtigheid) {
		ChampignonProfiel champignonProfiel = new ChampignonProfiel(champignonSoort, grootte, groeitijd, lux, temperatuur, luchtvochtigheid);
		champignonProfielService.save(champignonProfiel);

		return "redirect:/";
	}

}