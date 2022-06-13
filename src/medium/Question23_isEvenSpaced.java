package medium;

public class Question23_isEvenSpaced {
    public static void main(String[] args) {
        //int[] a = {100,19,131,140};
        //int[] a = {200,1,151,160};
        //int[] a = {200,10,151,160};
        //int[] a = {100,19,-131,-140};
        int[] a = {80,-56,11,-81};
        System.out.println(isEvenSpaced(a));
    }

    public static int isEvenSpaced(int[] a) {
        int max = a[0], min = a[0];

        for (int i : a) {
            if (max < i) {
                max = i;
            }
            if (min > i) {
                min = i;
            }
        }
        if ((max - min) % 2 == 0) {
            return 1;
        } else {
            return 0;
        }

    }
}
