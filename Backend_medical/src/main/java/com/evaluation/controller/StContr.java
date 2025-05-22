package com.evaluation.controller;

import com.evaluation.model.StkResp;
import com.evaluation.service.StkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/stocks")
public class StContr {

    @Autowired
    private StkService stockService;

    @GetMapping("/{ticker}")
    public ResponseEntity<StkResp> getAverageStockPrice(
            @PathVariable String ticker,
            @RequestParam int minutes,
            @RequestParam String aggregation) {
        return ResponseEntity.ok(stockService.getAveragePrice(ticker, minutes));
    }
}