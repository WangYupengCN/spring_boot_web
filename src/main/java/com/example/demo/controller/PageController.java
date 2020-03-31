package com.example.demo.controller;

import com.example.demo.dao.SiteConfig;
import com.example.demo.service.SiteConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.Optional;

@RestController
public class PageController extends WebMvcConfigurationSupport {

    @Autowired
    private SiteConfigService siteConfigService;

    @RequestMapping("/index.html")
    public ModelAndView index() {
        Optional<SiteConfig> optional =  siteConfigService.findById(1L);
        SiteConfig siteConfig = optional.get();
        ModelMap modelMap = new ModelMap();
        modelMap.addAttribute("mainTitle", siteConfig.getMainTitle())
                .addAttribute("subheading", siteConfig.getSubheading())
                .addAttribute("pageTitle", siteConfig.getPageTitle());
        return new ModelAndView("index", modelMap);
    }

}
