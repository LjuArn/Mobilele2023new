package com.example.mobilele2023new.repository;

import com.example.mobilele2023new.domain.entity.BrandEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BrandRepository extends JpaRepository<BrandEntity, Long> {

    @Query("SELECT n FROM BrandEntity n")
    List<BrandEntity> getAllBrands();
}
