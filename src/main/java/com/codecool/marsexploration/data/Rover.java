package com.codecool.marsexploration.data;

import com.codecool.marsexploration.logic.routine.Routine;

import java.util.ArrayList;
import java.util.List;

public class Rover {
    int id;
    Coordinate position;
    int sight;
    Routine routine;
    List<Coordinate> trackRecords;

    int numberOfMinerals = 0;
    int numberOfWater = 0;

    int numberOfAliens = 0;

    public Rover(int id, Coordinate position, int sight, Routine routine) {
        this.id = id;
        this.position = position;
        this.sight = sight;
        this.routine = routine;
        this.trackRecords = new ArrayList<>();
    }

    public int getNumberOfMinerals() {
        return numberOfMinerals;
    }

    public void setNumberOfMinerals(int numberOfMinerals) {
        this.numberOfMinerals = numberOfMinerals;
    }

    public int getNumberOfWater() {
        return numberOfWater;
    }

    public void setNumberOfWater(int numberOfWater) {
        this.numberOfWater = numberOfWater;
    }

    public int getId() {
        return id;
    }

    public Coordinate getPosition() {
        return position;
    }

    public int getSight() {
        return sight;
    }

    public Routine getRoutine() {
        return routine;
    }

    public List<Coordinate> getTrackRecords() {
        return trackRecords;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPosition(Coordinate position) {
        this.position = position;
    }

    public void setSight(int sight) {
        this.sight = sight;
    }

    public void setRoutine(Routine routine) {
        this.routine = routine;
    }

    public void setTrackRecords(List<Coordinate> trackRecords) {
        this.trackRecords = trackRecords;
    }


    public int getNumberOfAliens() {
        return numberOfAliens;
    }

    public void setNumberOfAliens(int numberOfAliens) {
        this.numberOfAliens = numberOfAliens;
    }
}
