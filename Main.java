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

        // 3. Converting array to ArrayList and vice versa
        ArrayConverter converter = new ArrayConverter();
        int[] sampleArray = { 1, 2, 3, 4, 5 };
        ArrayList<Integer> arrayList = converter.convertArrayToList(sampleArray);
        System.out.println("ArrayList: " + arrayList);

        int[] convertedArray = converter.arrayListToArray(arrayList);
        System.out.println("Converted Array: ");
        for (int num : convertedArray) {
            System.out.print(num + " ");
        }
    }
}
