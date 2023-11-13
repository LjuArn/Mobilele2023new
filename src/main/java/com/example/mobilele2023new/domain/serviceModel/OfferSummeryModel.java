package com.example.mobilele2023new.domain.serviceModel;


import com.example.mobilele2023new.domain.enums.EngineEnum;
import com.example.mobilele2023new.domain.enums.TransmissionEnum;
import java.math.BigDecimal;


public class OfferSummeryModel {

    private Long id;

    private String brand;
    private String model;
    private int year;
    private Integer mileage;
    private BigDecimal price;
    private EngineEnum engine;
    private TransmissionEnum transmission;
    private String imageUrl;



    public OfferSummeryModel() {
    }


    public String summary() {
        return brand + ", " + model + ", " + year;
    }

    public Long getId() {
        return id;
    }

    public OfferSummeryModel setId(Long id) {
        this.id = id;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public OfferSummeryModel setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public String getModel() {
        return model;
    }

    public OfferSummeryModel setModel(String model) {
        this.model = model;
        return this;
    }

    public int getYear() {
        return year;
    }

    public OfferSummeryModel setYear(int year) {
        this.year = year;
        return this;
    }

    public Integer getMileage() {
        return mileage;
    }

    public OfferSummeryModel setMileage(Integer mileage) {
        this.mileage = mileage;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public OfferSummeryModel setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public EngineEnum getEngine() {
        return engine;
    }

    public OfferSummeryModel setEngine(EngineEnum engine) {
        this.engine = engine;
        return this;
    }

    public TransmissionEnum getTransmission() {
        return transmission;
    }

    public OfferSummeryModel setTransmission(TransmissionEnum transmission) {
        this.transmission = transmission;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public OfferSummeryModel setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
}
