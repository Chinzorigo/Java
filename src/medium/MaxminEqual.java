package medium;

public class MaxminEqual {
    public static void main(String[] args) {
        int[] a = {2,2,2,2,2,2};
        System.out.println(isMaxMinEqual(a));
    }

    static int isMaxMinEqual(int[] a) {
        int isMaxMin;
        int maxCount = 0;
        int minCount = 0;
        int max = 0;
        int min = 0;
        int MaxMinAssign = 0;

        if(a.length < 2) return 0;
        for (int i : a) {
           if(MaxMinAssign == 0) {
               max = i;
               min = i;
               MaxMinAssign++;
           }
           if(max < i) {
               max = i;
           }
           if(min > i) {
               min = i;
           }
        }

        for(int i: a) {
            if(max == i) {
                maxCount++;
            }
            if(min == i) {
                minCount++;
            }
        }
        if(maxCount == minCount && min != max) {
            isMaxMin = 1;
        } else {
            isMaxMin = 0;
        }
        return isMaxMin;
    }
}
