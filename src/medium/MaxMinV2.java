package medium;

public class MaxMinV2 {
    public static void main(String[] args) {
        int[] a =  {2,2,2,2,2};
        System.out.println(f(a));
    }

    static int f(int[] a) {
        int max = a[0],
                min = a[0],
                maxCount = 0,
                minCount = 0;
        if (a.length < 2)
            return 0;
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
                maxCount = 1;
            } else if (min > a[i]) {
                min = a[i];
                minCount = 1;
            } else {
                if (max == a[i]) {
                    maxCount++;
                }
                if (min == a[i]) {
                    minCount++;
                }
            }
        }
        if (maxCount == minCount && max != min) {
            return 1;
        } else {
            return 0;
        }
    }
}