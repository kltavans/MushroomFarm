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

import com.example.MushroomFarm.ChampignonProfiel.ChampignonProfiel;

@Controller
public class ChampignonlogboekController {
	@Autowired
	private ChampignonlogboekService champignonlogboekService;

	//De pagina om de toegevoegde champignon profielen op te halen
		@RequestMapping("/logboek")
	    public String viewChampignonlogboek(Model model) {
			List<Champignonlogboek> listChampignonlogboek = champignonlogboekService.listAll();
		    model.addAttribute("listChampignonlogboek", listChampignonlogboek);

		    return "logboek";
	    }
}
