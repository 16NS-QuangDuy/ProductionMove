package com.hust.productionmove.model;

import com.hust.productionmove.validator.NotEmptyList;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FactoryExportProductModel {
    @NotNull(message = "factoryId cannot be null")
    private Long factoryId;
    @NotNull(message = "distributorId cannot be null")
    private Long distributorId;

    @NotNull(message = "productIds cannot be null")
    @NotEmptyList(message = "productIds cannot be null")
    private List<Long> productIds;
}
