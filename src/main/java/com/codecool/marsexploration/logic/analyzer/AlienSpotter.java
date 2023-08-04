package com.codecool.marsexploration.logic.analyzer;

import com.codecool.marsexploration.data.Context;
import com.codecool.marsexploration.data.Outcome;
import com.codecool.marsexploration.data.Symbol;


import java.util.Optional;

public class AlienSpotter implements Analyzer{
    @Override
    public Optional<Outcome> analyze(Context context) {
                if(context.getRover().getNumberOfAliens() > 0){
                    context.setOutcome(Outcome.NOT_COLONIZABLE_ALIENS);
                    return Optional.of(Outcome.NOT_COLONIZABLE_ALIENS);

        }

        return Optional.empty();
    }
}
