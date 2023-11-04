package com.example.mobilele2023new.domain.entity;

import com.example.mobilele2023new.domain.enums.EngineEnum;
import com.example.mobilele2023new.domain.enums.TransmissionEnum;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import java.math.BigDecimal;
import java.time.Instant;


@Entity
@Table(name = "offers")
public class OfferEntity extends BaseEntity {


    @Column(columnDefinition = "TEXT")
    @NotEmpty
    private String description;

    @Enumerated(EnumType.STRING)
    private EngineEnum engine;

    @Column
    @NotEmpty
    private String imageUrl;

    @Column
    @Positive
    private Integer mileage;

    @Column
    @NotNull
    private BigDecimal price;

    @Enumerated(EnumType.STRING)
    private TransmissionEnum transmission;

    @Column
    @Min(1930)
    private int year;

    @Column
    private Instant created;

    @Column
    private Instant modified;

    @ManyToOne
    @JoinColumn(name = "model_id")
    private ModelEntity model;

    @ManyToOne
    @JoinColumn(name = "seller_id")
    private UserEntity seller;


    public OfferEntity() {
    }

    public String getDescription() {
        return description;
    }

    public OfferEntity setDescription(String description) {
        this.description = description;
        return this;
    }

    public EngineEnum getEngine() {
        return engine;
    }

    public OfferEntity setEngine(EngineEnum engine) {
        this.engine = engine;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public OfferEntity setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public Integer getMileage() {
        return mileage;
    }

    public OfferEntity setMileage(Integer mileage) {
        this.mileage = mileage;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public OfferEntity setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public TransmissionEnum getTransmission() {
        return transmission;
    }

    public OfferEntity setTransmission(TransmissionEnum transmission) {
        this.transmission = transmission;
        return this;
    }

    public int getYear() {
        return year;
    }

    public OfferEntity setYear(int year) {
        this.year = year;
        return this;
    }

    public Instant getCreated() {
        return created;
    }

    public OfferEntity setCreated(Instant created) {
        this.created = created;
        return this;
    }

    public Instant getModified() {
        return modified;
    }

    public OfferEntity setModified(Instant modified) {
        this.modified = modified;
        return this;
    }

    public ModelEntity getModel() {
        return model;
    }

    public OfferEntity setModel(ModelEntity model) {
        this.model = model;
        return this;
    }

    public UserEntity getSeller() {
        return seller;
    }

    public OfferEntity setSeller(UserEntity seller) {
        this.seller = seller;
        return this;
    }
}


//•	description – some text.
//•	engine – enumerated value (GASOLINE, DIESEL, ELECTRIC, HYBRID).
//•	imageUrl – the url of image.
//•	mileage – a number.
//•	price – the price of the offer.
//•	transmission – enumerated value (MANUAL, AUTOMATIC).
//•	year – the year of offered car.

//•	created – a date and time.
//•	modified – a date and time.

//wryzki
//•	model – the model of a car.
//•	seller – a user that sells the car.