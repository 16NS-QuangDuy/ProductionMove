package com.hust.productionmove.repository;

import com.hust.productionmove.entity.Factory;
import com.hust.productionmove.entity.ProductBatch;
import com.hust.productionmove.entity.Stock;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BatchRepository extends JpaRepository<ProductBatch, Long> {
    List<ProductBatch> findAllByStockIsNull();

    List<ProductBatch> findAllByFactoryId(Long factoryId);

    List<ProductBatch> findAllByStock(Stock stock);

    List<ProductBatch> findAllByFactoryAndStockIsNull(Factory factory);


}
