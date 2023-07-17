package com.hust.productionmove.repository;

import com.hust.productionmove.entity.WarrantyCenter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface WarrantyCenterRepository extends JpaRepository<WarrantyCenter, Long> {
    Optional<WarrantyCenter> findByUnitId(Long unitId);
}
