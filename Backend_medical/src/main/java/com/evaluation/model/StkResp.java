package com.evaluation.model;

import java.util.List;

public class StkResp {
    private double averageStockPrice;
    private List<PricEntr> priceHistory;

    public StkResp(double averageStockPrice, List<PricEntr> priceHistory) {
        this.averageStockPrice = averageStockPrice;
        this.priceHistory = priceHistory;
    }

    public double getAverageStockPrice() { return averageStockPrice; }
    public void setAverageStockPrice(double averageStockPrice) { this.averageStockPrice = averageStockPrice; }

    public List<PricEntr> getPriceHistory() { return priceHistory; }
    public void setPriceHistory(List<PricEntr> priceHistory) { this.priceHistory = priceHistory; }
}