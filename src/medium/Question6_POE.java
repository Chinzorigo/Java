package medium;

public class Question6_POE {
    public static void main(String[] args) {
        //int[] a = {1,8,3,7,10,2};
        //int[] a = {1,5,3,1,1,1,1,1,1};
        int[] a = {2,1,1,1,2,1,7};
        //int[] a = {1,2,3};
        //int[] a = {3,4,5,10};

        System.out.println(f(a));
    }

    public static int f(int[] a) {
        int leftSum = 0;
        for(int i = 0 ; i < a.length-1; i++) {
            leftSum += a[i];
            int rightSum = 0;
            System.out.println("Left:" + leftSum);
            for (int j = i + 2; j < a.length; j++) {
                rightSum += a[j];

            }
            if(leftSum == rightSum) {
                return i + 1;
            }


        }
        return -1;

    }
}
