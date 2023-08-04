package com.codecool.marsexploration.logic.analyzer;

import com.codecool.marsexploration.data.Context;
import com.codecool.marsexploration.data.Outcome;

import java.util.Optional;

public class NotColonizableAnalyze implements Analyzer{

    @Override
    public Optional<Outcome> analyze(Context context) {
       if(context.getOutcome() == null){
            context.setOutcome(Outcome.NOT_COLONIZABLE_RESOURCES);
        } else if (context.getOutcome().equals(Outcome.NOT_COLONIZABLE_ALIENS) && !context.getOutcome().equals(Outcome.TIMEOUT) ){
            context.setOutcome(Outcome.NOT_COLONIZABLE_ALIENS);
        }
        return Optional.empty();
    }
}
