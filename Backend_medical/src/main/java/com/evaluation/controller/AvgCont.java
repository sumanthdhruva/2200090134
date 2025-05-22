package com.evaluation.controller;

import com.evaluation.service.AvgSer;
import com.evaluation.model.AvgRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/numbers")
public class AvgCont {

    @Autowired
    private AvgSer averageService;

    @GetMapping("/{numberId}")
    public ResponseEntity<AvgRes> getAverage(@PathVariable String numberId) {
        return ResponseEntity.ok(averageService.fetchAndCalculate(numberId));
    }
}