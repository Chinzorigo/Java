package medium;

public class Question25_isSym {
    public static void main(String[] args) {
        //int[] a = {2,7,9,10,11,5,8};
        //int[] a = {9,8,7,13,14,17};
        //int[] a = {2,7,8,9,11,13,10};
        int[] a = {1,1,2,1,3,2,3};
        System.out.println(isSym(a));
    }

    public static int isSym(int[] a) {

        for(int idx = 0, jdx = a.length-1; idx < jdx; idx++, jdx--) {
            int increasingArray = a[idx] % 2;
            int decreasingArray = a[jdx] % 2;
            if(increasingArray != decreasingArray) {
                return  0;

            }
        }
        return 1;
    }
}
