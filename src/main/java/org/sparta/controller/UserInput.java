package org.sparta.controller;

import java.util.Scanner;

public class UserInput {

    static Scanner scanner = new Scanner(System.in);

    public static int sorterSelection() {
        int selection = scanner.nextInt();
        return selection;
    }

    public static int arraySizeSelection() {
        int sizeSelection = scanner.nextInt();
        return sizeSelection;
    }

    public static void closeScanner() {
        scanner.close();
    }
}
