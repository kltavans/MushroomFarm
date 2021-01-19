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
}
