package com.example.MushroomFarm.Meting;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MetingController {
	@Autowired
	private MetingService metingService;
	
		//De pagina om de metingen weer te geven oplopend gesorteerd op datum 
		@RequestMapping("/metingen")
	    public String viewAllMetingen(Model model) {
 Logboek&Metingen-Long
			return listByPage(model, 1, "metingen", "asc");
	    }
		
		//De pagina met gesorteerde metingen
		@GetMapping("/metingen/page/{pageNumber}")
		public String listByPageMeting(Model model,
				@PathVariable("pageNumber") int currentMetingPage,
				@Param("sortField") String sortField,
				@Param("sortDir") String sortDir) {
			Page<Meting> metingPage = metingService.listAll(currentMetingPage, sortField, sortDir);
			long totalMetingen= metingPage.getTotalElements();
			int totalMetingPages = metingPage.getTotalPages();
			
			List<Meting> listMetingen = metingPage.getContent();
			
			model.addAttribute("currentMetingPage", currentMetingPage);
			model.addAttribute("totalMetingen", totalMetingen);
			model.addAttribute("totalMetingPages", totalMetingPages);
		    model.addAttribute("listMetingen", listMetingen);
		    model.addAttribute("sortField", sortField);
		    model.addAttribute("sortDir", sortDir);
		    
		    String reverseSortDir = sortDir.equals("asc") ? "desc" : "asc";
		    model.addAttribute("reverseSortDir", reverseSortDir);

		    return "metingen";
		}
}
