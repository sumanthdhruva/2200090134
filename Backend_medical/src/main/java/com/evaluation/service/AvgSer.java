package com.evaluation.service;

import com.evaluation.model.AvgRes;
import org.springframework.stereotype.Service;

@Service
public class AvgSer {
    public AvgRes fetchAndCalculate(String numberId) {
        // Placeholder logic
        AvgRes response = new AvgRes();
        response.setAvg(4.00);
        response.setWindowCurrState(new int[]{1, 3, 5, 7});
        return response;
    }
}