package com.hust.productionmove.model;

import com.hust.productionmove.entity.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SoldProductModel {
    private Long id;
    private ProductLine productLine;
    private String status;
    private ProductBatch batch;

    private Order order;
    private CustomerProduct customerProduct;
}
