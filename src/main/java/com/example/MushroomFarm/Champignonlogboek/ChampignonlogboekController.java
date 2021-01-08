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
	public String saveLogboek(@RequestParam("champignonlogboekID") int meldingnummer,
			@RequestParam("metingID") int metingID, @RequestParam("datum") Date datum,
			@RequestParam("deviceID") String deviceID, @RequestParam("champignonsoort") String champignonsoort,
			@RequestParam("grootte") String grootte, @RequestParam("meldingLux") String meldingLux,
			@RequestParam("lux") int lux, @RequestParam("meldingTemperatuur") String meldingTemperatuur,
			@RequestParam("temperatuur") Double temperatuur,
			@RequestParam("meldingLuchtvochtigheid") String meldingLuchtvochtigheid,
			@RequestParam("luchtvochtigheid") int luchtvochtigheid) {
		Champignonlogboek champignonlogboek = new Champignonlogboek(meldingnummer, metingID, datum, deviceID,
				champignonsoort, grootte, meldingLux, lux, meldingTemperatuur, temperatuur, meldingLuchtvochtigheid,
				luchtvochtigheid);
		champignonlogboekService.save(champignonlogboek);

		return "redirect:/";
	}
}
