package com.hust.productionmove.repository;

import com.hust.productionmove.entity.ErrorProduct;
import com.hust.productionmove.entity.Factory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ErrorProductRepository extends JpaRepository<ErrorProduct, Long> {
    List<ErrorProduct> findAllByFactory(Factory factory);
}
