//NeighboringNumbers.java

//finding neighboring numbers with the smallest distance
public class NeighboringNumbers {
    public int findSmallestDistance(int[] array) {
        if (array.length < 2) {
            throw new IllegalArgumentException("Array length should be at least 2");
        }

        int minDistance = Integer.MAX_VALUE;
        int index = -1;

        // loop to calculate difference between adjacent elements
        for (int i = 0; i < array.length - 1; i++) {
            int distance = Math.abs(array[i] - array[i + 1]);
            if (distance < minDistance) {
                minDistance = distance;
                index = i;
            }
        }
        return index;
    }
}
