//ArrayConverter.java

import java.util.ArrayList;
import java.util.Arrays;

//class for converting array to ArrayList and vice versa
public class ArrayConverter {
    public ArrayList<Integer> convertArrayToList(int[] array) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int num : array) {
            arrayList.add(num);
        }
        return arrayList;
    }

    public int[] arrayListToArray(ArrayList<Integer> arrayList) {
        int[] array = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            array[i] = arrayList.get(i);
        }
        return array;
    }
}
