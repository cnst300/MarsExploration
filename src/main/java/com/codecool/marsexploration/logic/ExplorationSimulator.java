package com.codecool.marsexploration.logic;

import com.codecool.marsexploration.data.Context;
import com.codecool.marsexploration.data.Rover;
import com.codecool.marsexploration.data.SimulationInput;
import com.codecool.marsexploration.logic.phase.*;
import com.codecool.marsexploration.logic.routine.ExplorationRoutine;
import com.codecool.marsexploration.util.Reader;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExplorationSimulator {
    FileWriter writer;
    List<Phase> phases = new ArrayList<>();
    public Context simulate(SimulationInput input) throws IOException {
         Context context = init(input);
        while(context.getOutcome() == null){
            for(Phase phase : phases){
                phase.perform(context);

            }
            System.out.println(context.getStepNumber());
        }
        writer.close();
        return context;
    }

    public Context init(SimulationInput input) throws IOException {
        writer = new FileWriter("src/main/resources/exploration-3.log", false);
        Rover rover = new Rover(1, input.landing(), 2, new ExplorationRoutine());
        String[] map = Reader.read(input.mapPath());
        Context context = new Context(input.timeout(), map, input.landing(), rover, input.logPath());
        phases.add(new ScanPhase());
        phases.add(new AnalysisPhase());
        phases.add(new LogPhase(writer));
        phases.add(new MovePhase());
        phases.add(new StepIncrementPhase());
        return  context;
    }

}
