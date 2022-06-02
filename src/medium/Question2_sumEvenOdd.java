package medium;

public class Question2_sumEvenOdd {
    public static void main(String[] args) {
        int[] a =  {3,3,4,4,-1};
        System.out.println(f(a));
    }

    static int f(int[] a) {
        int sumOfOdd =0, sumOfEven = 0;

        for(int idx: a) {
            if (idx % 2 == 0) {
                sumOfEven += idx;
            } else {
                sumOfOdd += idx;
            }
        }
        return sumOfOdd - sumOfEven;
    }
}
