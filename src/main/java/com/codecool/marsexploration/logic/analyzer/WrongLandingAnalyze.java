package com.codecool.marsexploration.logic.analyzer;


import com.codecool.marsexploration.data.Context;
import com.codecool.marsexploration.data.Outcome;
import com.codecool.marsexploration.data.Symbol;

import java.util.Optional;

public class WrongLandingAnalyze implements Analyzer{
    @Override
    public Optional<Outcome> analyze(Context context) {
        if(context.getMap()[context.getRover().getPosition().x()].charAt(context.getRover().getPosition().y()) !=  Symbol.EMPTY.getSymbol().charAt(0)){
            context.setOutcome(Outcome.WRONG_LANDING_COORDINATES);
            return Optional.of(Outcome.WRONG_LANDING_COORDINATES);

        }
        return Optional.empty();
    }
}
