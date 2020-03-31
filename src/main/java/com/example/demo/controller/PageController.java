package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@RestController
public class PageController extends WebMvcConfigurationSupport {

    @RequestMapping("/index.html")
    public ModelAndView index() {
        ModelMap modelMap = new ModelMap();
        modelMap.addAttribute("title", "测试title");
        return new ModelAndView("index", modelMap);
    }

}
