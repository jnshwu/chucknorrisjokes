package com.jinshiwu.webapp.controllers;

import com.jinshiwu.webapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by EL on 8/20/18.
 */
@Controller
public class ChuckNorrisController {
    private JokeService jokeService;

    @Autowired
    public ChuckNorrisController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", "", "chucknorris"})
    public String showJoke(Model model){

        model.addAttribute("joke", jokeService.getjoke());

        return "chucknorris";
    }
}
