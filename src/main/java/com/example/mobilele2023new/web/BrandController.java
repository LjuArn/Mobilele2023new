package com.example.mobilele2023new.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BrandController {

    @GetMapping("/brands")
    public String addBrands(){
        return "brands";
    }
}
