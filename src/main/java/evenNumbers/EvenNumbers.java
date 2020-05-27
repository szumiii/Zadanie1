package evenNumbers;

import java.util.ArrayList;

public class EvenNumbers {

    public ArrayList<Integer> notEven(ArrayList<Integer> list) {
        ArrayList<Integer> oddList = new ArrayList<Integer>();
        for (int x : list) {
            if (x % 2 == 0) {
                oddList.add(x);
            }
        }
        return oddList;
    }
}
