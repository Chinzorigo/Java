package medium;

public class Question24_isSub {
    public static void main(String[] args) {
        int[] a = {11,5,3,2};
        System.out.println(isSub(a));
    }

    public static int isSub(int[] a) {
        int sumOfRestElements = 0;

        for(int idx = a.length - 1; idx > 0; idx--) {
            sumOfRestElements += a[idx];
            if(sumOfRestElements >= a[idx-1]) {
                return 0;

            }

        }
        return 1;
    }
}
