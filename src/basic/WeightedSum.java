package basic;

public class WeightedSum {
    public static void main(String[] args) {

        System.out.println(computeWeightedSum(new int[] {1, 2, 3, 4, 5}));
    }

    static int computeWeightedSum(int[ ] a) {
        int sumOfEven = 0;
        int sumOfOdd = 0;

        for (int i = 0; i < a.length; i++) {
            if(a[i] % 2 == 0) {
                sumOfEven += a[i];
            } else {
                sumOfOdd += a[i];
            }
        }


        return 2*sumOfEven + 3* sumOfOdd;

    }
}
