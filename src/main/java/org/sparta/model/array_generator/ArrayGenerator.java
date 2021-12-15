package org.sparta.model.array_generator;

import java.util.Arrays;
import java.util.Random;

public class ArrayGenerator {

        // Initialising random object.
        private final Random random = new Random();

        public int[] randomArrayGenerator(int size) {
            int [] randomArray = new int[size];
            for (int i = 0; i < randomArray.length; i++){
                randomArray[i] = random.nextInt(Integer.MAX_VALUE);
            }
            return randomArray;
        }
}
