package com.codecool.marsexploration.logic.analyzer;

import com.codecool.marsexploration.data.Context;
import com.codecool.marsexploration.data.Outcome;

import java.util.Optional;

public class ColonizableAnalyze implements Analyzer{
    @Override
    public Optional<Outcome> analyze(Context context) {

        if(context.getRover().getNumberOfMinerals() >= 2 && context.getRover().getNumberOfWater() >= 2){
            context.setOutcome(Outcome.COLONIZABLE);
            return Optional.of(Outcome.COLONIZABLE);
        }

        return Optional.empty();
    }
}
