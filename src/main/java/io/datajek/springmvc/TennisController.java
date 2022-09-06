package io.datajek.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
public class TennisController {

    @Autowired
    PlayerService service;

    @RequestMapping(value = "/")
    public String welcome() {
        return "main-menu";
    }

    @RequestMapping("/showPlayerForm")
    public String showForm() {
        return "search-player-form";
    }

    @RequestMapping("/processPlayerForm")
    public String processForm(@RequestParam(value = "playerName", defaultValue="Monfils") String pName, Model model) {
        Player player = service.getPlayerByName(pName);
        String theName = pName.toUpperCase();
        model.addAttribute("name", theName);
        model.addAttribute("country", player.getNationality());
        model.addAttribute("dob", player.getBirthDate());
        model.addAttribute("titles", player.getTitles());
        return "player-detail";
    }
}
