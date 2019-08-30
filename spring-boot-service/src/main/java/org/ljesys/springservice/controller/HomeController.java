package org.ljesys.springservice.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

/**
 * Created by lje on 8/30/2019.
 */
@Controller
public class HomeController {

    @GetMapping({"/", "/home"})
    public String home(Model model, @AuthenticationPrincipal Principal user) {
        model.addAttribute("user", user.getName());

        return "home";
    }
}
