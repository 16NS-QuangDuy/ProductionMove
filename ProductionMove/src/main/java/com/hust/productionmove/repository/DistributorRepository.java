package com.hust.productionmove.repository;

import com.hust.productionmove.entity.Distributor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DistributorRepository extends JpaRepository<Distributor, Long> {
    Optional<Distributor> findByUnitId(Long unitId);
}
