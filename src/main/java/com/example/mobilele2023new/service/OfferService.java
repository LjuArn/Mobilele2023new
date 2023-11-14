package com.example.mobilele2023new.service;

import com.example.mobilele2023new.domain.serviceModel.CreateOfferModel;
import com.example.mobilele2023new.domain.serviceModel.OfferAllServiceModel;
import com.example.mobilele2023new.domain.serviceModel.OfferSummeryModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface OfferService {
    void addOffer(CreateOfferModel createOfferModel);

    List<OfferSummeryModel> getAllOffersNow();

    OfferAllServiceModel findOfferById(Long id);
}
