package medium;

public class Question8_nUpCount {
    public static void main(String[] args) {
        int[] a = {2,3,1,-6,8,-3,-1,2};
        int n = 5;
        System.out.println(nUpCount(a,n));
    }

    static int nUpCount(int[] a, int n) {
        int upCount = 0;
        int previousPartialSum;
        int currentPartialSum = 0;

        for(int i = 0; i < a.length; i++) {
            previousPartialSum = currentPartialSum;
            currentPartialSum += a[i];
            if (previousPartialSum <= n && currentPartialSum > n) {
                upCount++;
            }

        }
        return upCount;
    }
}
