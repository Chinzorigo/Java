package medium;

import java.util.Arrays;

public class Question3_character {
    public static void main(String[] args) {
        char[] a = {'a','b','c'};
        //int start = 1, len = 2;
        //int start = 1, len = 1;
        //int start = 2, len = 2;
        //int start = 2, len = 1;
        //int start = 3, len = 1;
        //int start = 1, len = 0;
        //int start = -1, len = 2;
        int start = -1, len = -2;

        System.out.println(f(a, start, len));
    }
    public static String f(char[] a, int start, int len) {
        if(a == null || start < 0 || len < 0 || start >= a.length || len >= a.length || len+start > a.length) {
            return null;

        }
        char[] returnChar =  new char[len];

        for(int idx = start, jdx = 0; jdx < len; idx++, jdx++) {

            returnChar[jdx] = a[idx];
        }
        return Arrays.toString(returnChar) ;
    }
}
