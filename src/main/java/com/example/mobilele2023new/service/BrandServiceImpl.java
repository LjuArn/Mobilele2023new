package com.example.mobilele2023new.service;

import com.example.mobilele2023new.repository.BrandRepository;
import org.springframework.stereotype.Service;

@Service
public class BrandServiceImpl implements BrandService {

    private  final BrandRepository brandRepository;

    public BrandServiceImpl(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

//    @Override
//    public List<BrandDTO> getAllBrands() {
//return  brandRepository.getAllBrands().stream()
//        .map(brandEntity -> new BrandDTO(
//                brandEntity.getName(),
//                brandEntity.getModels().stream()
//                        .map(modelEntity -> new ModelDTO(modelEntity.getId(), modelEntity.getName()))
//                        .sorted(Comparator.comparing(ModelDTO::getName))
//                        .collect(Collectors.toList())
//
//
//        ))
//        .sorted(Comparator.comparing(BrandDTO::getName))
//        .collect(Collectors.toList());
//    }

}


//        return brandRepository.getAllBrands().stream()
//                .map(brand -> new BrandDTO(
//                        brand.getName(),
//                        brand.getModels().stream()
//                                .map(model -> new ModelDTO(model.getId(), model.getName()))
//                                .sorted(Comparator.comparing(ModelDTO::name))
//                                .collect(Collectors.toList())
//                ))
//                .sorted(Comparator.comparing(BrandDTO::name))
//                .collect(Collectors.toList());