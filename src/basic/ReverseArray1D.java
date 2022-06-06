package basic;

import java.util.Arrays;

public class ReverseArray1D {
    public static void main(String[] args) {
        int[] a = {21, 123, 789, 1234567890, 998877};

        System.out.println(Arrays.toString(isVanilla(a)));
    }

    static int[] isVanilla(int[] a) {

        int[] reversedArray = new int[a.length];

        for(int i = 0; i < a.length; i++) {
            int reversed = 0;
            while(a[i] > 0) {
                int remainder = a[i] % 10;
                reversed = reversed * 10 + remainder;
                a[i] /= 10;

            }
            reversedArray[i] = reversed;

        }


        return reversedArray;
    }
}
