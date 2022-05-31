package medium;

public class Question22_sumFactor {
    public static void main(String[] args) {
        //int[] a = {1,-1,1,-1,1,-1,1};
        //int[] a = {3,0,2,-5,0};
        //int[] a = {9,-3,-3,-1,-1};
        //int[] a = {1};
        int[] a = {0,0,0};
        System.out.println(sumFactor(a));
    }
    public static int sumFactor(int[] a) {
        int sumOfArray = 0;
        int sumOfFactor = 0;
        for(int i = 0; i < a.length; i++) {
            sumOfArray += a[i];
        }
        for (int jdx: a) {
            if(jdx == sumOfArray) {
                sumOfFactor++;
            }
        }
        return sumOfFactor;
    }
}
