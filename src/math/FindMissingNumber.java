package math;

import java.util.ArrayList;

/**
 * Created by Shakir on 4/9/16.
 */
public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10,2,1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Use some static helper method to find it.
         */
        int [] ArrayList = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        for (int i = 0; i < ArrayList.length; i++) {
            for (int j = i + 1; j < ArrayList.length; j++) {
                if (ArrayList[j] < ArrayList[i]) {
                    int temp = ArrayList[j];
                    ArrayList[j] = ArrayList[i];
                    ArrayList[i] = temp;
                }
            }
        }
        ArrayList<Integer> ArrayInt = new ArrayList<Integer>();
        int j = ArrayList[0];
        for (int k = 0; k < ArrayList.length; k++) {
            if (j == ArrayList[k]) {
                j++;
                continue;
            } else {
                ArrayInt.add(j);
                k--;
                j++;
            }
        }
        System.out.print("From the given Number the missing number is: ");
        for (int r : ArrayInt) {
            System.out.println(" " + r);
        }

    }
}