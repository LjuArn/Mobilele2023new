package com.example.mobilele2023new.domain.bindingModel;

import com.example.mobilele2023new.domain.entity.ModelEntity;
import com.example.mobilele2023new.domain.enums.EngineEnum;
import com.example.mobilele2023new.domain.enums.TransmissionEnum;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;


public class CreateOfferBindingModel {

    private ModelEntity model;
    @Positive
    @NotNull
    private BigDecimal price;

    private EngineEnum engine;
    private TransmissionEnum transmission;
    @Min(1930)
    private int year;
    @Positive
    private Integer mileage;
    @Size(min = 5, max = 512)
    private String description;

    private String imageUrl;

    public CreateOfferBindingModel() {
    }

    public ModelEntity getModel() {
        return model;
    }

    public CreateOfferBindingModel setModel(ModelEntity model) {
        this.model = model;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public CreateOfferBindingModel setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public EngineEnum getEngine() {
        return engine;
    }

    public CreateOfferBindingModel setEngine(EngineEnum engine) {
        this.engine = engine;
        return this;
    }

    public TransmissionEnum getTransmission() {
        return transmission;
    }

    public CreateOfferBindingModel setTransmission(TransmissionEnum transmission) {
        this.transmission = transmission;
        return this;
    }

    public int getYear() {
        return year;
    }

    public CreateOfferBindingModel setYear(int year) {
        this.year = year;
        return this;
    }

    public Integer getMileage() {
        return mileage;
    }

    public CreateOfferBindingModel setMileage(Integer mileage) {
        this.mileage = mileage;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateOfferBindingModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public CreateOfferBindingModel setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
}
