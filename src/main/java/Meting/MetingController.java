package Meting;

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

public class MetingController {
	@Autowired
	private MetingService metingService;
	
	@RequestMapping("/meting/toevoegen")
    public String showNewProductPage(Model model) {
        Meting meting = new Meting();
        model.addAttribute("meting", meting);

        return "MetingToevoegen";
    }

	@RequestMapping(value = "/meting/save", method = RequestMethod.POST)
	public String saveMeting(@RequestParam("metingID") int metingID,
            @RequestParam("deviceID") String deviceID,
            @RequestParam("datum") Date datum,
            @RequestParam("lux") int lux,
            @RequestParam("temperatuur") Double temperatuur,
            @RequestParam("luchtvochtigheid") int luchtvochtigheid) {
		Meting meting = new Meting(metingID, deviceID, datum, lux, temperatuur, luchtvochtigheid);
		metingService.save(meting);

		return "redirect:/";
	}
}
