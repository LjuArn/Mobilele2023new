package com.example.mobilele2023new.domain.entity;

import com.example.mobilele2023new.domain.enums.ModelCategoryEnum;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;

import java.time.Instant;

@Entity
@Table(name = "models")
public class ModelEntity extends BaseEntity {

    @Column
    private String name;

    @Enumerated(EnumType.STRING)
    private ModelCategoryEnum category;

    @Column(columnDefinition = "TEXT")
    private String imageUrl;

    @Column
    private Integer startYear;

    @Column
    private Integer endYear;

    @Column
    private Instant created;

    @Column
    private Instant modified;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinColumn(name = "brand_id")
    private BrandEntity brand;

    public ModelEntity() {
    }

    public String getName() {
        return name;
    }

    public ModelEntity setName(String name) {
        this.name = name;
        return this;
    }

    public ModelCategoryEnum getCategory() {
        return category;
    }

    public ModelEntity setCategory(ModelCategoryEnum category) {
        this.category = category;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public ModelEntity setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public Integer getStartYear() {
        return startYear;
    }

    public ModelEntity setStartYear(Integer startYear) {
        this.startYear = startYear;
        return this;
    }

    public Integer getEndYear() {
        return endYear;
    }

    public ModelEntity setEndYear(Integer endYear) {
        this.endYear = endYear;
        return this;
    }

    public Instant getCreated() {
        return created;
    }

    public ModelEntity setCreated(Instant created) {
        this.created = created;
        return this;
    }

    public Instant getModified() {
        return modified;
    }

    public ModelEntity setModified(Instant modified) {
        this.modified = modified;
        return this;
    }

    public BrandEntity getBrand() {
        return brand;
    }

    public ModelEntity setBrand(BrandEntity brand) {
        this.brand = brand;
        return this;
    }
}

//•	name – a model name.
//•	category – an enumeration (Car, Buss, Truck, Motorcycle)
//•	imageUrl – the url of image with size between 8 and 512 characters.
//•	startYear – a number.
//•	endYear – a number.
//•	created – a date and time.
//•	modified – a date and time.
//•	brand – a model brand.