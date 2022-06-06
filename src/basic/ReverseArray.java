package basic;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] a =  {35,3, 1,45,1};
        System.out.println(Arrays.toString(f(a)));
    }

    static int[] f(int[] a) {
        int[] reversedArray = new int[a.length];
        int j = 0;
        for(int i: a) {

            int reverse = 0;
            while (i > 0) {
                int remainder = i % 10;
                reverse = reverse * 10 + remainder;
                i /= 10;
            }
            reversedArray[j] = reverse;
            j++;
        }

        return reversedArray;
    }
}
