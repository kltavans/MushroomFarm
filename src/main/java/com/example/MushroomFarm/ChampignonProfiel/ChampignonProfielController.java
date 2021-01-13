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
	
	//De pagina om de toegevoegde champignon profielen op te halen
	@RequestMapping("/champignon-profielen")
    public String viewAllChampignonProfielen(Model model) {
		List<ChampignonProfiel> listChampignonProfielen = champignonProfielService.listAll();
	    model.addAttribute("listChampignonProfielen", listChampignonProfielen);

	    return "champignonProfielen";
    }
	
	//De pagina om een champignon profiel toe te voegen
	@RequestMapping("/champignon-profiel/toevoegen")
    public String showNewProductPage(Model model) {
        ChampignonProfiel champignon_profiel = new ChampignonProfiel();
        model.addAttribute("champignon_profiel", champignon_profiel);

        return "champignonProfielToevoegen";
    }

	//Het opslaan van een champignon profiel
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
	
	//De pagina om een champignon profiel te wijzigen
    @RequestMapping("/champignon-profiel/{champignon_id}/bijwerken")
    public ModelAndView showChampignonProfielBijwerkenPage(@PathVariable(name = "champignon_id") int champignon_id) {
        ModelAndView mav = new ModelAndView("champignonProfielBijwerken");
        ChampignonProfiel champignon_profiel = champignonProfielService.get(champignon_id);
        mav.addObject("champignon_profiel", champignon_profiel);

        return mav;
    }
    
    //Het wijzigen van een champignon profiel opslaan
    @RequestMapping(value = "/champignon-profiel/{champignon_id}/bijwerken/save", method = RequestMethod.POST)
    public String champignonProfielBijwerken(@RequestParam("champignon_id") Integer cp_champignon_id, 
    		@RequestParam("champignon_soort") String cp_champignon_soort,
            @RequestParam("grootte") String cp_grootte,
            @RequestParam("groeitijd") Integer cp_groeitijd,
            @RequestParam("lux") Integer cp_lux,
            @RequestParam("temperatuur") Double cp_temperatuur,
            @RequestParam("luchtvochtigheid") Integer cp_luchtvochtigheid) {
    	champignonProfielService.champignonProfielBijwerken(cp_champignon_soort, cp_grootte, cp_groeitijd, cp_lux, cp_temperatuur, cp_luchtvochtigheid, cp_champignon_id);

        return "redirect:/champignon-profielen";
    }

}