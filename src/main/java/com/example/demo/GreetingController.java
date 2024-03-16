package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @Autowired
    private GreetingRepository greetingRepository;

    @GetMapping("/greeting")
    public String greetingForm(@RequestParam(value="content", defaultValue="Default content") String content, Model model) {
        Greeting greeting = new Greeting();
        greeting.setContent(content);
        model.addAttribute("greeting", greeting);
        return "greeting";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
        greetingRepository.save(greeting);
        Iterable<Greeting> greetings = greetingRepository.findAll();
        model.addAttribute("greetings", greetings);
        return "result";
    }
}