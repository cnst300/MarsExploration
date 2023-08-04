package com.codecool.marsexploration.util;

import com.codecool.marsexploration.data.Coordinate;

public class MapUtil {
    public static boolean isValidCoordinate(Coordinate coordinate, int mapWidth){
        return coordinate.x() >= 0 && coordinate.y() >= 0 && coordinate.x() < mapWidth && coordinate.y() < mapWidth;
    }
}
