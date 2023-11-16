package com.example.mobilele2023new.web;

import com.example.mobilele2023new.domain.bindingModel.CreateOfferBindingModel;
import com.example.mobilele2023new.domain.serviceModel.CreateOfferModel;
import com.example.mobilele2023new.domain.serviceModel.OfferAllServiceModel;
import com.example.mobilele2023new.service.OfferService;
import jakarta.validation.Valid;
import org.hibernate.ObjectNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;

@Controller
@RequestMapping("/offers")
public class OfferController {

    private final OfferService offerService;
    private final ModelMapper modelMapper;

    public OfferController(OfferService offerService, ModelMapper modelMapper) {
        this.offerService = offerService;
        this.modelMapper = modelMapper;
    }

    @GetMapping("/add")
    public String add(Model model) {
        if (!model.containsAttribute("createOfferBindingModel")) {
            model.addAttribute("createOfferBindingModel", new CreateOfferBindingModel());
        }
        return "offer-add";
    }


    @PostMapping("/add")
    public String addConfirm(@Valid CreateOfferBindingModel createOfferBindingModel,
                             BindingResult bindingResult,
                             RedirectAttributes redirectAttributes) throws IOException {

        if (bindingResult.hasErrors()) {
            redirectAttributes
                    .addFlashAttribute("createOfferBindingModel", createOfferBindingModel);
            redirectAttributes
                    .addFlashAttribute("org.springframework.validation.BindingResult.createOfferBindingModel",
                            bindingResult);
            return "redirect:add";
        }

        offerService.addOffer(modelMapper.map(createOfferBindingModel, CreateOfferModel.class));

        return "redirect:/";
    }


    @GetMapping("/details/{id}")
    public String details(@PathVariable Long id, Model model) {


        model.addAttribute("offer", offerService.findOfferById(id));
  //      model.addAttribute("sellerFirstName", offerService.findOfferById(id).getSeller().);



//        model.addAttribute("route", routeService.findRouteById(id));
//        model.addAttribute("authorName", routeService.findRouteById(id).getAuthor().getUsername());

        return "details";
    }


    //    OfferAllServiceModel offerAllServiceModel = offerService
    //                .findOfferById(id)
    //                .orElseThrow(() -> new ObjectNotFoundException("Offer with uuid " + id + " not found!"));


}


