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

@Controller
public class ChampignonProfielController {
	
	@Autowired
	private ChampignonProfielService champignonProfielService;
	
	@RequestMapping("/champignon-profielen")
    public String viewAllChampignonProfielen(Model model) {
		List<ChampignonProfiel> listChampignonProfielen = champignonProfielService.listAll();
	    model.addAttribute("listChampignonProfielen", listChampignonProfielen);

	    return "champignonProfielen";
    }
	
	@RequestMapping("/champignon-profiel/toevoegen")
    public String showNewProductPage(Model model) {
        ChampignonProfiel champignon_profiel = new ChampignonProfiel();
        model.addAttribute("champignon_profiel", champignon_profiel);

        return "champignonProfielToevoegen";
    }

	@RequestMapping(value = "/champignon-profiel/save", method = RequestMethod.POST)
	public String saveChampignonProfiel(@RequestParam("champignon_soort") String champignon_soort,
            @RequestParam("grootte") String grootte,
            @RequestParam("groeitijd") Integer groeitijd,
            @RequestParam("lux") Integer lux,
            @RequestParam("temperatuur") Double temperatuur,
            @RequestParam("luchtvochtigheid") Integer luchtvochtigheid) {
		ChampignonProfiel champignon_profiel = new ChampignonProfiel(champignon_soort, grootte, groeitijd, lux, temperatuur, luchtvochtigheid);
		champignonProfielService.save(champignon_profiel);

		return "redirect:/champignon-profielen";
	}

}