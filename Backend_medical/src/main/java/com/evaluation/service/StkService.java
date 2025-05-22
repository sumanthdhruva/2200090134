package com.evaluation.service;

import com.evaluation.model.StkResp;
import com.evaluation.model.PricEntr;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class StkService {
    public StkResp getAveragePrice(String ticker, int minutes) {
        List<PricEntr> prices = Arrays.asList(
            new PricEntr(231.95, "2025-05-08T04:26:27.4658491Z"),
            new PricEntr(124.95, "2025-05-08T04:30:23.465940341Z"),
            new PricEntr(459.09, "2025-05-08T04:39:14.464887447Z"),
            new PricEntr(998.27, "2025-05-08T04:50:03.464903606Z")
        );

        double average = prices.stream().mapToDouble(PricEntr::getPrice).average().orElse(0);
        return new StkResp(average, prices);
    }
}