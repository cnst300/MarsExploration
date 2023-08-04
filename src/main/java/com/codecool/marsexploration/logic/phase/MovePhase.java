package com.codecool.marsexploration.logic.phase;

import com.codecool.marsexploration.data.Context;

public class MovePhase implements Phase {
    @Override
    public void perform(Context context) {

        context.getRover().getRoutine().move(context);
    }
}
