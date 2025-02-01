// EvenOddSeparator.java

import java.util.ArrayList;
import java.util.Scanner;

//class for separating even and odd numbers into different arrays
public class EvenOddSeparator {
    public void separateEvenOdd() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();

        System.out.println("Enter numbers (type -1 to stop): ");
        while (true) {
            int num = scanner.nextInt();
            if (num == -1) {
                break;
            }
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }
        System.out.println("Array of even numbers: " + even);
        System.out.println("Array of odd numbers: " + odd);

        scanner.close();
    }
}