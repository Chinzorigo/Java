package edabit;

import java.util.Arrays;

public class generateACountdownOfNumbersInAnArray {
    public static void main(String[] args) {
        int start = 5;
        System.out.println(Arrays.toString(countdown(start)));
    }

    public static int[] countdown(int start) {
        int[] c = new int[start+1];
        for(int i=start; i>=0; i--){
            c[start-i] = i;
        }
        return c;
        /*int[] arr  = new int[start+1];
        for(int idx = 0; idx <=arr.length-1; idx++) {
            arr[idx] = start;
            start--;
        }
        return arr;

         */
    }
}
