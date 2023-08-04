package com.codecool.marsexploration.logic.routine;

import com.codecool.marsexploration.data.Context;
import com.codecool.marsexploration.data.Coordinate;
import com.codecool.marsexploration.data.Symbol;
import com.codecool.marsexploration.logic.phase.AnalysisPhase;

import java.util.Arrays;
import java.util.Random;

public class ExplorationRoutine implements Routine {
    Random random = new Random();

    @Override
    public void move(Context context) {
        int posX = context.getRover().getPosition().x();
        int posY = context.getRover().getPosition().y();
        int sight = context.getRover().getSight();
        Coordinate position = new Coordinate(random.nextInt(3) -1 + posX, random.nextInt(3) -1 + posY);

        while (context.getRover().getPosition().equals(position)
                || posX + sight < 0
                || position.x() < 0
                || posY + sight < 0
                || position.y() < 0
                || posX + sight > context.getMap().length
                || posY + sight > context.getMap().length
                || context.getMap()[position.x()].charAt(position.y()) != Symbol.EMPTY.getSymbol().charAt(0)
                || position.x() >= context.getMap().length
                ) {
            position = new Coordinate(random.nextInt(3) - 1 + posX, random.nextInt(3) -1 + posY);
        }





        context.getRover().setPosition(position);

    }

}
