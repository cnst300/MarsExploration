package com.codecool.marsexploration.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reader {
    public static String[] read(String mapPath) {
        try {
            List<String> map = new ArrayList<>();
            File myObj = new File(mapPath);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                map.add(data);
            }
            myReader.close();
            System.out.println(map.size());
            System.out.println(map.get(0).length());

            return map.toArray(String[]::new);

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            throw new RuntimeException(e);

        }
    }
}
