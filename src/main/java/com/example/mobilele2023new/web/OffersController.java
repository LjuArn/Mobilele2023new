package com.example.mobilele2023new.web;


import com.example.mobilele2023new.domain.serviceModel.OfferSummeryModel;
import com.example.mobilele2023new.service.OfferService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/offers")
public class OffersController {

    private final OfferService offerService;

    public OffersController(OfferService offerService) {
        this.offerService = offerService;
    }



    @GetMapping("/all")
    public String all(Model model){

        model.addAttribute("offers", offerService.getAllOffersNow());
        return "offers";
    }


}


