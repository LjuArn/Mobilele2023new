package com.example.mobilele2023new.domain.serviceModel;

import com.example.mobilele2023new.domain.entity.BrandEntity;
import com.example.mobilele2023new.domain.entity.ModelEntity;
import com.example.mobilele2023new.domain.entity.UserEntity;
import com.example.mobilele2023new.domain.enums.EngineEnum;
import com.example.mobilele2023new.domain.enums.TransmissionEnum;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.Instant;

public class OfferAllServiceModel {

    private Long id;
    private int year;
    private String model;
    private String brand;
    private Integer mileage;
    private BigDecimal price;
    private EngineEnum engine;
    private TransmissionEnum transmission;
    private Instant created;
    private Instant modified;
    private String seller;

    public OfferAllServiceModel() {
    }

    public Long getId() {
        return id;
    }

    public OfferAllServiceModel setId(Long id) {
        this.id = id;
        return this;
    }

    public int getYear() {
        return year;
    }

    public OfferAllServiceModel setYear(int year) {
        this.year = year;
        return this;
    }

    public String getModel() {
        return model;
    }

    public OfferAllServiceModel setModel(String model) {
        this.model = model;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public OfferAllServiceModel setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public Integer getMileage() {
        return mileage;
    }

    public OfferAllServiceModel setMileage(Integer mileage) {
        this.mileage = mileage;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public OfferAllServiceModel setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public EngineEnum getEngine() {
        return engine;
    }

    public OfferAllServiceModel setEngine(EngineEnum engine) {
        this.engine = engine;
        return this;
    }

    public TransmissionEnum getTransmission() {
        return transmission;
    }

    public OfferAllServiceModel setTransmission(TransmissionEnum transmission) {
        this.transmission = transmission;
        return this;
    }

    public Instant getCreated() {
        return created;
    }

    public OfferAllServiceModel setCreated(Instant created) {
        this.created = created;
        return this;
    }

    public Instant getModified() {
        return modified;
    }

    public OfferAllServiceModel setModified(Instant modified) {
        this.modified = modified;
        return this;
    }

    public String getSeller() {
        return seller;
    }

    public OfferAllServiceModel setSeller(String seller) {
        this.seller = seller;
        return this;
    }
}


//                    Offer year Brand name Model name</h5>
//            </div>
//            <ul class="offer-details list-group list-group-flush">
//                <li class="list-group-item">
//                    <div class="card-text"><span>• Mileage</span></div>
//                    <th:block th:text="*{mileage}">zxssdsdsds</th:block>
//                    <div class="card-text"><span>• Price</span></div>
//                    <th:block th:text="*{price}">123</th:block>
//                    <div class="card-text"><span>• Engine type</span></div>
//                    <th:block th:text="*{engine}">PETROL</th:block>
//                    <div class="card-text"><span>• Transmission type</span></div>
//                    <th:block th:text="*{transmission}">TRANSMISSION</th:block>
//                    <div class="card-text"><span>• Offer created</span></div>
//
//                    <div class="card-text"><span>• Offer modified</span></div>
//
//                    <div class="card-text"><span>• Seller - First and Last name</span></div>