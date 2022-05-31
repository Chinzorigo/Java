package medium;

public class question15 {
    public static void main(String[] args) {
        System.out.println(answerThree(new int[] {5,4,3,2,3,4,6,1}));
    }

    static int answerThree(int[] a) {
        int sumOfFirstHalf = 0;
        int sumOfSecondHalf = 0;
        if (a.length % 2 == 0 ) {
            for(int idx = 0; idx < a.length/2; idx++) {
                sumOfFirstHalf += a[idx];
            }
            for (int jdx = a.length/2; jdx < a.length; jdx++) {
                sumOfSecondHalf += a[jdx];
            }
            if(sumOfFirstHalf == sumOfSecondHalf) {
                return 1;
            }
        }


        return 0;
    }
}
