package ksum;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
 * <p>
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 */


public class Solution {

    public static Boolean addToK (List<Integer> arr, int k) {

        boolean addUp = false;

        for (int i = 0; i < arr.size(); i++) {
            int curNum = arr.get(i);
            int otherNum = k - curNum;

            System.out.println("CurNum: " + curNum + " otherNum: " + otherNum);

            if (arr.contains(otherNum)) {
                addUp = true;
                break;
            }

        }

        return addUp;

    }

    public static void main (String[] args) {

        int[] arr = {10, 15, 3, 7};

        List<Integer> arrayList = new ArrayList<Integer>();

        for (int i : arr) {
            arrayList.add(Integer.valueOf(i));
        }
        System.out.println(addToK(arrayList, 18));
    }


}
