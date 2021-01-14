package com.example.MushroomFarm.Batches;

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
public class BatchesController {
	
	@Autowired
	private BatchesService batchesService;
	
	@RequestMapping("/batch/toevoegen")
    public String showNewProductPage(Model model) {
        Batch batCH = new Batch();
        model.addAttribute("batCH", batCH);

        return "BatchToevoegen";
    }

	@RequestMapping(value = "/batch/save", method = RequestMethod.POST)
	public String saveBatch(@RequestParam("champignon_id") Integer champignon_id,
            @RequestParam("device_id") String device_id,
            @RequestParam("champignon_soort") String champignon_soort,
            @RequestParam("grootte") String grootte,
            @RequestParam("groeitijd") Integer groeitijd) {
		Batch batCH = new Batch(champignon_id, device_id, champignon_soort, grootte, groeitijd);
		batchesService.save(batCH);

		return "redirect:/";
	}

}