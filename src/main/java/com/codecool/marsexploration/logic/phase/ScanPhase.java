package com.codecool.marsexploration.logic.phase;

import com.codecool.marsexploration.data.*;
import com.codecool.marsexploration.util.MapUtil;


public class ScanPhase implements Phase {

    @Override
    public void perform(Context context) {
        int sight = context.getRover().getSight();
        int xRover = context.getRover().getPosition().x();
        int yRover = context.getRover().getPosition().y();

        if (sight > xRover && sight > yRover) {

            for (int i = sight - xRover; i < xRover + sight; i++) {
                for (int j = sight - yRover; j < yRover + sight; j++) {
                    count(i, j, context);
                }
            }
        } else if (sight > xRover) {

            for (int i = sight - xRover; i < xRover + sight; i++) {
                for (int j = yRover - sight; j < yRover + sight; j++) {
                    count(i, j, context);
                }
            }
        } else if (sight > yRover) {
            for (int i = xRover - sight; i < xRover + sight; i++) {
                for (int j = sight - yRover; j < yRover + sight; j++) {
                    count(i, j, context);
                }
            }
        } else {
            for (int i = xRover - sight; i < xRover + sight; i++) {
                for (int j = yRover - sight; j < yRover + sight; j++) {
                    count(i, j, context);
                }
            }
        }


    }

    private void count(int i, int j, Context context) {
        if(!MapUtil.isValidCoordinate(new Coordinate(i, j), context.getMap().length)) {
            return;
        }

        if (context.getMap()[i].charAt(j) == Symbol.MINERAL.getSymbol().charAt(0)) {
            context.getRover().setNumberOfMinerals(context.getRover().getNumberOfMinerals() + 1);
            String row = context.getMap()[i];
            row = row.substring(0, j) + Symbol.EMPTY.getSymbol().charAt(0) + row.substring(j + 1);
            context.getMap()[i] = row;

        } else if (context.getMap()[i].charAt(j) == Symbol.WATER.getSymbol().charAt(0)) {
            context.getRover().setNumberOfWater(context.getRover().getNumberOfWater() + 1);
            String row = context.getMap()[i];
            row = row.substring(0, j) + Symbol.EMPTY.getSymbol().charAt(0) + row.substring(j + 1);
            context.getMap()[i] = row;

        }
        if (context.getMap()[i].charAt(j) == Symbol.ALIEN.getSymbol().charAt(0)) {
            context.getRover().setNumberOfAliens(context.getRover().getNumberOfAliens() + 1);
        }

    }


}