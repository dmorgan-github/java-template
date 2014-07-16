package com.dmorgan.skeleton.web.admin;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dmorgan on 7/16/14.
 */
@Controller
@EnableAutoConfiguration
public class HomeController {

    @RequestMapping(value="/")
    public String index(){
        return "thymeleaf/content/home";
    }
}
