package com.example.mobilele2023new.service;

import com.example.mobilele2023new.domain.entity.OfferEntity;
import com.example.mobilele2023new.domain.serviceModel.CreateOfferModel;
import com.example.mobilele2023new.domain.serviceModel.OfferSummeryModel;
import com.example.mobilele2023new.repository.OfferRepository;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OfferServiceImpl implements OfferService {

    private final OfferRepository offerRepository;
    private final ModelMapper modelMapper;

    public OfferServiceImpl(OfferRepository offerRepository, ModelMapper modelMapper) {
        this.offerRepository = offerRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public void addOffer(CreateOfferModel createOfferModel) {

        OfferEntity offerNew = modelMapper.map(createOfferModel, OfferEntity.class);

        offerRepository.save(offerNew);
    }

    @Override
    public List<OfferSummeryModel> getAllOffersNow() {
        List<OfferSummeryModel> test = offerRepository
                .findAll()
                .stream()
                .map(offerEntity -> {
                    OfferSummeryModel offerSummeryModel = modelMapper.map(offerEntity, OfferSummeryModel.class);
                    offerSummeryModel.setModel(offerEntity.getModel().getName());
                    offerSummeryModel.setBrand(offerEntity.getModel().getBrand().getName());
                    return offerSummeryModel;
                })
                .collect(Collectors.toList());

        return test;

    }

}


//        taskNew.setPriority(priorityService.findTaskByPriorityNameEnum(taskServiceModel.getPriorityNameEnum()));
