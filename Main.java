//Main.java
//Name: Disha Deepak Gupta
//PRN: 24070126513
//Batch: A2

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. Seperating numbers into even and odd arrays
        EvenOddSeparator separator = new EvenOddSeparator();
        separator.separateEvenOdd();

        // 2. Finding neighboring numbers with the smallest distance
        int[] array = { 5, 8, 2, 7, 10 };
        NeighboringNumbers finder = new NeighboringNumbers();
        int index = finder.findSmallestDistance(array);
        System.out.println("Index of the first number is: " + index);

    }

}
