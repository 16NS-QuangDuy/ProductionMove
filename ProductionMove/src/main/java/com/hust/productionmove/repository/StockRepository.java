package com.hust.productionmove.repository;

import com.hust.productionmove.entity.Stock;
import com.hust.productionmove.entity.Unit;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, Long> {

    Optional<Stock> findByStockOwner(Unit unit);

}
