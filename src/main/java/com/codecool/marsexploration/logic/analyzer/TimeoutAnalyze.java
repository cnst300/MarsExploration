package com.codecool.marsexploration.logic.analyzer;

import com.codecool.marsexploration.data.Context;
import com.codecool.marsexploration.data.Outcome;

import java.util.Optional;

public class TimeoutAnalyze implements Analyzer {
    @Override
    public Optional<Outcome> analyze(Context context) {
        if(context.getStepNumber() == context.getTimeout()){
            context.setOutcome(Outcome.TIMEOUT);
           return Optional.of(Outcome.TIMEOUT);
        }
        return Optional.empty();
    }
}
