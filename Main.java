package com.skyscraper.gl;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int totalFloors;
    public static int[] totalFloorSize;

    public static void main(String[] args) {
        Skyscraper myDriverObj = new Skyscraper();
        myDriverObj.getInputs();
        myDriverObj.calculateAndPrintOrderOfConstruction(myDriverObj.totalFloorSize);
    }
} 
 
