package com.hust.productionmove.repository;

import com.hust.productionmove.entity.ProductTransaction;
import com.hust.productionmove.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductTransactionRepository extends JpaRepository<ProductTransaction, Long> {
    List<ProductTransaction> findAllByImportStockAndTransactionStatus(Stock stock, String status);
}
