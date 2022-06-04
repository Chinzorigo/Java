package medium;

public class LargestDifferenceOfEvensV2 {
    public static void main(String[] args) {
        System.out.println(largestDifferenceOfEvens(new int[ ]{1, 18, 5, 2, 7, 33}));
    }

    static int largestDifferenceOfEvens(int[] a) {
        int largeDifference = 0, distance = 0, count = 0;
        for(int i=0; i < a.length; i++) {
            if(a[i] % 2 == 0) {
                for(int j = 0; j < a.length; j++) {
                    if(a[j] % 2 == 0) {
                        distance = a[i] - a[j];
                        if(distance > largeDifference) {
                            largeDifference = distance;
                        }
                    }
                }
            }
            count++;
        }
        if(count == 0) {
            return -1;
        }
        return largeDifference;
    }
}
