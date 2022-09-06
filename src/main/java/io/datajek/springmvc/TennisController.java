package io.datajek.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

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
    public String processForm(HttpServletRequest request, Model model) {
        String pName = request.getParameter("playerName");
        Player player = service.getPlayerByName(pName);
        model.addAttribute("name", pName);
        model.addAttribute("country", player.getNationality());
        model.addAttribute("dob", player.getBirthDate());
        model.addAttribute("titles", player.getTitles());
        return "player-detail";
    }
}
