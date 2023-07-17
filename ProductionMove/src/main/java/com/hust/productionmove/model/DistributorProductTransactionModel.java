package com.hust.productionmove.model;

import com.hust.productionmove.entity.Distributor;
import com.hust.productionmove.entity.ProductTransactionDetail;
import com.hust.productionmove.entity.Stock;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DistributorProductTransactionModel {
    private Long id;
    private Stock exportStock;
    private Stock importStock;
    private String transactionStatus;
    private List<ProductTransactionDetail> productTransactionDetails;
    private Distributor distributor;

    public DistributorProductTransactionModel(
            Long id, Stock exportStock, Stock importStock, String transactionStatus,
            List<ProductTransactionDetail> productTransactionDetails) {
        this.id = id;
        this.exportStock = exportStock;
        this.importStock = importStock;
        this.transactionStatus = transactionStatus;
        this.productTransactionDetails = productTransactionDetails;
    }
}
