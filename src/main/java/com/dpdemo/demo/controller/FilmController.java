package com.dpdemo.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 */
@RestController
@RequestMapping("/film")
public class FilmController {

    @RequestMapping("/test")
    public String test(){
        return "say hello";
    }

}
