package com.example.MushroomFarm.Champignonlogboek;

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

public class ChampignonlogboekController {
	@Autowired
	private ChampignonlogboekService champignonlogboekService;

	@RequestMapping("/champignonlogboek/toevoegen")
	public String showNewProductPage(Model model) {
		Champignonlogboek champignonlogboek = new Champignonlogboek();
		model.addAttribute("champignonlogboek", champignonlogboek);

		return "ChampignonlogboekToevoegen";
	}

	@RequestMapping(value = "/champignonlogboek/save", method = RequestMethod.POST)
	public String saveLogboek(@RequestParam("nummer") int nummer,
			@RequestParam("meting_id") int meting_id, @RequestParam("datum") Date datum,
			@RequestParam("device_id") String device_id, @RequestParam("champignon_soort") String champignon_soort,
			@RequestParam("grootte") String grootte, @RequestParam("melding_lux") String melding_lux,
			@RequestParam("lux") int lux, @RequestParam("melding_temperatuur") String melding_temperatuur,
			@RequestParam("temperatuur") Double temperatuur,
			@RequestParam("melding_luchtvochtigheid") String melding_luchtvochtigheid,
			@RequestParam("luchtvochtigheid") int luchtvochtigheid) {
		Champignonlogboek champignonlogboek = new Champignonlogboek(nummer, meting_id, datum, device_id,
				champignon_soort, grootte, melding_lux, lux, melding_temperatuur, temperatuur, melding_luchtvochtigheid,
				luchtvochtigheid);
		champignonlogboekService.save(champignonlogboek);

		return "redirect:/";
	}
}
