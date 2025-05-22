package com.evaluation.service;

import com.evaluation.model.CorResp;
import com.evaluation.model.PricEntr;
import com.evaluation.model.StkResp;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CorrServ {

    public CorResp calculateCorrelation(String t1, String t2, int minutes) {
        // Simulate price history for correlation example
        List<PricEntr> x = List.of(
            new PricEntr(10, "T1"),
            new PricEntr(20, "T2"),
            new PricEntr(30, "T3")
        );
        List<PricEntr> y = List.of(
            new PricEntr(30, "T1"),
            new PricEntr(20, "T2"),
            new PricEntr(10, "T3")
        );

        double[] X = x.stream().mapToDouble(PricEntr::getPrice).toArray();
        double[] Y = y.stream().mapToDouble(PricEntr::getPrice).toArray();

        double meanX = Arrays.stream(X).average().orElse(0);
        double meanY = Arrays.stream(Y).average().orElse(0);

        double covXY = 0, stdX = 0, stdY = 0;
        for (int i = 0; i < X.length; i++) {
            covXY += (X[i] - meanX) * (Y[i] - meanY);
            stdX += Math.pow(X[i] - meanX, 2);
            stdY += Math.pow(Y[i] - meanY, 2);
        }

        covXY /= (X.length - 1);
        stdX = Math.sqrt(stdX / (X.length - 1));
        stdY = Math.sqrt(stdY / (X.length - 1));

        double correlation = covXY / (stdX * stdY);

        return new CorResp(correlation);
    }
}