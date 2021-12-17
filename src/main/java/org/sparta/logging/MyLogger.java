package org.sparta.logging;

import java.io.IOException;
import java.util.logging.*;

public class MyLogger {

    public static Logger myLogger = Logger.getLogger("myLogger");

    static {
        try {
            Handler fileHandler = new FileHandler("src/main/java/org/sparta/logging/programLog.log", false);
            myLogger.addHandler(fileHandler);
            fileHandler.setFormatter(new SimpleFormatter());
            fileHandler.setLevel(Level.ALL);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }





}
