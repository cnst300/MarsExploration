package com.codecool.marsexploration.logic.phase;

import com.codecool.marsexploration.data.Context;
import com.codecool.marsexploration.data.Outcome;
import com.codecool.marsexploration.logic.analyzer.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AnalysisPhase implements Phase{
    List<Analyzer> analysis = new ArrayList<>();
    Optional<Outcome> outcome = Optional.empty();
    @Override
    public void perform(Context context) {
        addAnalyzer();
        for (int i = 0; i < analysis.size() && outcome.isEmpty(); i++) {
            outcome = analysis.get(i).analyze(context);
        }
        outcome.ifPresent(context::setOutcome);
        if (context.getOutcome() != null){
        System.out.println(context.getOutcome());}
    }
    public void addAnalyzer() {
       analysis.add(new AlienSpotter());
       analysis.add(new ColonizableAnalyze());
       analysis.add(new TimeoutAnalyze());
       analysis.add(new WrongLandingAnalyze());
    }
}
