package com.example.mobilele2023new.service;

import com.example.mobilele2023new.domain.entity.OfferEntity;
import com.example.mobilele2023new.domain.serviceModel.CreateOfferModel;
import com.example.mobilele2023new.repository.OfferRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

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
}



//        taskNew.setPriority(priorityService.findTaskByPriorityNameEnum(taskServiceModel.getPriorityNameEnum()));
