package Problem2;

import java.util.Arrays;

public class Solution {


    public static int[] productArr (int[] input) {

        int prod = 1;
        for (int cur : input) {
            prod *= cur;
        }
        System.out.println("Product: " + prod);

        for (int i = 0; i < input.length; i++) {
            input[i] = prod / input[i];
        }
        System.out.println(Arrays.toString(input));
        return input;
    }

    public static void main (String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        productArr(arr);

        int[] arr1 = {2, 3, 6};
        productArr(arr1);

    }

}
