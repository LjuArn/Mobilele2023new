package com.example.mobilele2023new.domain.serviceModel;

import com.example.mobilele2023new.domain.entity.ModelEntity;
import com.example.mobilele2023new.domain.enums.EngineEnum;
import com.example.mobilele2023new.domain.enums.TransmissionEnum;
import jakarta.validation.constraints.*;

import java.math.BigDecimal;

public class CreateOfferModel {

    private Long id;
    private ModelEntity model;
    private BigDecimal price;
    private EngineEnum engine;
    private TransmissionEnum transmission;
    private int year;
    private Integer mileage;
    private String description;
    private String imageUrl;

    public CreateOfferModel() {
    }

    public Long getId() {
        return id;
    }

    public CreateOfferModel setId(Long id) {
        this.id = id;
        return this;
    }

    public ModelEntity getModel() {
        return model;
    }

    public CreateOfferModel setModel(ModelEntity model) {
        this.model = model;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public CreateOfferModel setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public EngineEnum getEngine() {
        return engine;
    }

    public CreateOfferModel setEngine(EngineEnum engine) {
        this.engine = engine;
        return this;
    }

    public TransmissionEnum getTransmission() {
        return transmission;
    }

    public CreateOfferModel setTransmission(TransmissionEnum transmission) {
        this.transmission = transmission;
        return this;
    }

    public int getYear() {
        return year;
    }

    public CreateOfferModel setYear(int year) {
        this.year = year;
        return this;
    }

    public Integer getMileage() {
        return mileage;
    }

    public CreateOfferModel setMileage(Integer mileage) {
        this.mileage = mileage;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateOfferModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public CreateOfferModel setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
}
