package com.mark.fundamentalshtmlcss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //handles incoming web request
public class FundamentalsController {

    @GetMapping("/") //endpoint localhost:8080/
    public String index() {
        return "index";
    }

    @GetMapping("/fundamentals") //endpoint localhost:8080/fundamentals
    public String fundamentals() {
        return "fundamentals";
    }

    @GetMapping("/elements") //endpoint localhost:8080/elements
    public String elements() {
        return "elements";
    }

    @GetMapping("/resume") //endpoint localhost:8080/
    public String resume() {
        return "resume";
    }
}
