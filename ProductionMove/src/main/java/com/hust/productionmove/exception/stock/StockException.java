package com.hust.productionmove.exception.stock;

public abstract class StockException extends Exception {
    public StockException(String errorMessage) {
        super(errorMessage);
    }
}
