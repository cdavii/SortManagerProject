package org.sparta.model.array_generator;

import java.util.Arrays;
import java.util.Random;
import java.util.logging.Level;

import static org.sparta.logging.MyLogger.myLogger;

public class ArrayGenerator {

        private final Random random = new Random();

        public int[] randomArrayGenerator(int size) {
            int [] randomArray = new int[size];
            for (int i = 0; i < randomArray.length; i++){
                randomArray[i] = random.nextInt(Integer.MAX_VALUE);
            }
            myLogger.log(Level.INFO, "Random array of length " + size + " generated.\nArray before sorting:\n" + Arrays.toString(randomArray));
            return randomArray;
        }
}
