package medium;

public class LargestDifferenceOfEvens {
    public static void main(String[] args) {
        System.out.println(largestDifferenceOfEvens(new int[ ]{1, 18, 5, 7, 33}));
    }

    static int largestDifferenceOfEvens(int[] a) {
        int maxEven = 0;
        int minEven = 0;
        int countEven = 0;
        int largestDifference;

        for (int idx = 0; idx < a.length; idx++) {
            if(a[idx] % 2 == 0) {
                if(countEven == 0) {
                    maxEven = a[idx];
                    minEven = a[idx];
                }
                countEven++;
                if(maxEven < a[idx]) {
                    maxEven = a[idx];
                }
                if(minEven > a[idx]) {
                    minEven = a[idx];
                }
            }

        }
        System.out.println("Max: " + maxEven);
        System.out.println("Min: " + minEven);

        largestDifference = maxEven - minEven;
        if(countEven < 2) {
            largestDifference = -1;
            System.out.println("countEven < 2");
        }

        return largestDifference;


    }
}
