package medium;

public class LargestDifferenceOfEvens {
    public static void main(String[] args) {
        System.out.println(largestDifferenceOfEvens(new int[ ]{1, 18, 5, -2, 7, 33}));
    }

    static int largestDifferenceOfEvens(int[] a) {
        int maxEven = 0;
        int minEven = 0;
        int countEven = 0;
        int largestDifference;

        for (int i : a) {
            if (i % 2 == 0) {
                if (countEven == 0) {
                    maxEven = i;
                    minEven = i;
                }
                countEven++;
                if (maxEven < i) {
                    maxEven = i;
                }
                if (minEven > i) {
                    minEven = i;
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
