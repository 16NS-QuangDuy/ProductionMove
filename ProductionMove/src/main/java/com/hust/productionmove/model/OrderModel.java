package com.hust.productionmove.model;

import com.hust.productionmove.validator.NotEmptyList;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderModel {
    private Long id;

    @NotNull(message = "orderDate cannot be null")
    private LocalDate orderDate;

    @NotNull(message = "customerId cannot be null")
    private Long customerId;

    @NotNull(message = "distributorId cannot be null.")
    private Long distributorId;

    @NotNull(message = "order details cannot be null.")
    @Valid
    @NotEmptyList
    private List<OrderDetailModel> orderDetailList;
}
