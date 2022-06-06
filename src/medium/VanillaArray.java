package medium;

import java.util.Arrays;

public class VanillaArray {
    public static void main(String[] args) {
        int[] a = {21, 123, 789, 1234567890, 998877};
        int len = 5;
        System.out.println(Arrays.toString(isVanilla(a,len)));
    }

    static int[] isVanilla(int[] a, int len) {
//        int onlyElement = 0;
//        if (a.length > 0) {
//            int remainder = a[0] % 10;
//            onlyElement = remainder;
//        }
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
