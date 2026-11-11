package org.simas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MatchController {
    @GetMapping("/new-match")
    public String getNewMatchPage(){
        return "new-match";
    }
}
