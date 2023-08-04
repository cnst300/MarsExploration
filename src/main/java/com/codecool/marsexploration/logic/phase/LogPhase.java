package com.codecool.marsexploration.logic.phase;

import com.codecool.marsexploration.data.Context;

import java.io.FileWriter;
import java.io.IOException;

public class LogPhase implements Phase {




    FileWriter writer;
    public LogPhase(FileWriter writer) {
        this.writer = writer;
    }
    public FileWriter getWriter() {
        return writer;
    }

    @Override
    public void perform(Context context) {
        StringBuilder sb = new StringBuilder();
        if(context.getOutcome() == null){
           sb.append("STEP: " + context.getStepNumber() + ";")
                    .append("EVENT: Position; ")
                    .append("UNIT: rover -" + context.getRover().getId() + ";" )
                    .append("POSITION: [" + context.getRover().getPosition().x() + "," + context.getRover().getPosition().y() + "]" + "\n");
        } else {
            sb.append("STEP: " + context.getStepNumber() + ";")
                    .append("EVENT: Outcome; ")
                    .append("OUTCOME " + context.getOutcome() + "\n");
        }
        try {
            writer.write(sb.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
