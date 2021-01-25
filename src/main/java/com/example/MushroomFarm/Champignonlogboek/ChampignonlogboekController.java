package com.example.MushroomFarm.Champignonlogboek;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.MushroomFarm.ChampignonProfiel.ChampignonProfiel;

@Controller
public class ChampignonlogboekController {
	@Autowired
	private ChampignonlogboekService champignonlogboekService;

		//De pagina om het champignonlogboek weer te geven oplopend gesorteerd op datum 
		@RequestMapping("/logboek")
	    public String viewChampignonlogboek(Model model) { 
		    return listByPageChampignonlogboek(model, 1, "nummer", "desc");
	    }
		
		//De pagina met een gesorteerde logboek
		@GetMapping("/logboek/page/{pageNumber}")
		public String listByPageChampignonlogboek(Model model,
				@PathVariable("pageNumber") int currentLogboekPage,
				@Param("sortField") String sortField,
				@Param("sortDir") String sortDir) {
			Page<Champignonlogboek> logboekPage = champignonlogboekService.listAll(currentLogboekPage, sortField, sortDir);
			long totalLogboekMeldingen= logboekPage.getTotalElements();
			int totalLogboekPages = logboekPage.getTotalPages();
			
			List<Champignonlogboek> listLogboek = logboekPage.getContent();
			
			model.addAttribute("currentLogboekPage", currentLogboekPage);
			model.addAttribute("totalLogboekMeldingen", totalLogboekMeldingen);
			model.addAttribute("totalLogboekPages", totalLogboekPages);
		    model.addAttribute("listLogboek", listLogboek);
		    model.addAttribute("sortField", sortField);
		    model.addAttribute("sortDir", sortDir);
		    
		    String reverseSortDir = sortDir.equals("asc") ? "desc" : "asc";
		    model.addAttribute("reverseSortDir", reverseSortDir);

		    return "logboek";
		}
		
		//HomePage Logboek laatste 10 meldingen laten zien
		@RequestMapping("/")
	    public String viewLastTen(Model model) {
			List<Champignonlogboek> listChampignonLogboeken = champignonlogboekService.findLastTen(10);
		    model.addAttribute("listChampignonLogboeken", listChampignonLogboeken);

		    return "index";
	    }
}
