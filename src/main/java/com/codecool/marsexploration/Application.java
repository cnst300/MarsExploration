package com.codecool.marsexploration;



import com.codecool.marsexploration.data.Coordinate;
import com.codecool.marsexploration.data.SimulationInput;
import com.codecool.marsexploration.logic.ExplorationSimulator;

import java.io.IOException;


public class Application {
    public static void main(String[] args) throws IOException {
        ExplorationSimulator simulator = new ExplorationSimulator();
        SimulationInput input = new SimulationInput(
                "src/main/resources/exploration-3.map",
                new Coordinate(3, 3),
                100,
                "src/main/resources/exploration-3.log");
      simulator.simulate(input);

    }
}
