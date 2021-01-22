package com.example.MushroomFarm.Meting;

import java.sql.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
		@RequestMapping("/metingen")
	    public String viewAllMetingen(Model model) {
			return listByPage(model, 1, "device", "asc");
	    }
		
		@GetMapping("/page/{pageNumber}")
		public String listByPage(Model model,
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
