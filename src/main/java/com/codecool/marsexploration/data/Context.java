package com.codecool.marsexploration.data;


public class Context {
    int stepNumber;
    long timeout;

    String[] map;
    Coordinate landing;
    Rover rover;
    Outcome outcome;
    String logFile;


    public Context(long timeout, String[] map, Coordinate landing, Rover rover, String logFile) {
        this.stepNumber = 0;
        this.timeout = timeout;
        this.map = map;
        this.landing = landing;
        this.rover = rover;
        this.outcome = null;
        this.logFile = logFile;
    }

    public int getStepNumber() {
        return stepNumber;
    }

    public long getTimeout() {
        return timeout;
    }

    public String[] getMap() { return map;
    }

    public Coordinate getLanding() {
        return landing;
    }

    public Rover getRover() {
        return rover;
    }

    public Outcome getOutcome() { return outcome;
    }

    public String getLogFile() {
        return logFile;
    }

    public void setStepNumber(int stepNumber) {
        this.stepNumber = stepNumber;
    }

    public void setOutcome(Outcome outcome) {
        this.outcome = outcome;
    }

}
