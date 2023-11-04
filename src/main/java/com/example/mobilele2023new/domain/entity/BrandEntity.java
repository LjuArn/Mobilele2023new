package com.example.mobilele2023new.domain.entity;


import jakarta.persistence.*;

import java.time.Instant;
import java.util.List;

@Entity
@Table(name = "brands")
public class BrandEntity extends BaseEntity {

    @Column(unique = true, nullable = false)
    private String name;

    @Column
    private Instant created;

    @Column
    private Instant modified;

    @OneToMany(mappedBy = "brand", fetch = FetchType.EAGER)
    private List<ModelEntity> models;


    public BrandEntity() {
    }

    public String getName() {
        return name;
    }

    public BrandEntity setName(String name) {
        this.name = name;
        return this;
    }

    public Instant getCreated() {
        return created;
    }

    public BrandEntity setCreated(Instant created) {
        this.created = created;
        return this;
    }

    public Instant getModified() {
        return modified;
    }

    public BrandEntity setModified(Instant modified) {
        this.modified = modified;
        return this;
    }

    public List<ModelEntity> getModels() {
        return models;
    }

    public BrandEntity setModels(List<ModelEntity> models) {
        this.models = models;
        return this;
    }
}

//•	name – a name of brand.
//•	created – a date and time.
//•	modified – a date and time.