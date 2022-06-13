package medium;

public class DaphneArray {
    public static void main(String[] args) {
        //int[] a = {2, 4, 6, 16};
        int[] a = {1, 5, 15, 3, 9};
        System.out.println(isDaphneArray(a));
    }

    static int isDaphneArray(int[] a) {
        int evenCount = 0;
        int oddCount = 0;
        for(int i: a) {
            if(i % 2 ==0) {
                evenCount++;
            }
            if(i % 2 == 1) {
                oddCount++;
            }
        }

        if(evenCount == a.length || oddCount == a.length) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
