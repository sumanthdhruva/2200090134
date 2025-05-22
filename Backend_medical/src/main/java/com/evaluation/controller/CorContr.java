package com.evaluation.controller;

import com.evaluation.model.CorResp;
import com.evaluation.service.CorrServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/stockcorrelation")
public class CorContr {

    @Autowired
    private CorrServ correlationService;

    @GetMapping
    public ResponseEntity<CorResp> getCorrelation(
            @RequestParam int minutes,
            @RequestParam String ticker1,
            @RequestParam String ticker2) {
        return ResponseEntity.ok(correlationService.calculateCorrelation(ticker1, ticker2, minutes));
    }
}