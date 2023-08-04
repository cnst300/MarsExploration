package com.codecool.marsexploration.util;

import com.codecool.marsexploration.data.Context;


import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    FileWriter writer;
    Context context;

    public Writer(Context context) throws IOException {
        this.writer = new FileWriter(context.getLogFile(), true);
        this.context = context;
    }

    public void writer() {
        try {
            writer.write(context.getStepNumber());
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

