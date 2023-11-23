package com.autoservice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainPageController {

    @GetMapping("/")
    public String displayIndexPage(){
        return "index";
    }

    @GetMapping("/404")
    public String displayErrorPage(){
        return "404";
    }

}
