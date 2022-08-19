package io.datajek.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TennisController {

    @RequestMapping(value = "/")
    public String welcome() {
        return "main-menu";
    }

    @RequestMapping("/showPlayerForm")
    public String showForm() {
        return "search-player-form";
    }

    @RequestMapping("/processPlayerForm")
    public String processForm() {
        return "player-detail";
    }
}
