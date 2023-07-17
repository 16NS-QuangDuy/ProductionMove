package com.hust.productionmove.model;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.hust.productionmove.validator.NotEmptyList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FactoryExportModel {
    @NotNull(message = "factoryId cannot be null")
    private Long factoryId;
    @NotNull(message = "distributorId cannot be null")
    private Long distributorId;

    @NotNull(message = "exportBatchIds cannot be null")
    @NotEmptyList(message = "exportBatchList cannot be null")
    private List<Long> exportBatchIds;
}
