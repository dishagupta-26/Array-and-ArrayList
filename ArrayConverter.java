//ArrayConverter.java

import java.util.ArrayList;
import java.util.Arrays;

//class for converting array to ArrayList and vice versa
public class ArrayConverter {
    public ArrayList<Integer> convertArrayToList(int[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int num : arr) {
            arrayList.add(num);
        }
        return arrayList;
    }

}
