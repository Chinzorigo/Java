
package edabit;

import java.util.Arrays;

public class reverseCodingChallenge3 {
    public static void main(String[] args) {
        int[] arr = {9, 8, 16, 47};
        int num = 4;
        System.out.println(Arrays.toString(mysteryFunc(arr, num)));
    }

    public static int[] mysteryFunc(int[] arr,int num) {

        for (int idx = 0; idx < arr.length; idx++) {
            arr[idx] = arr[idx] % num;

        }

        return  arr;
    }

}
