package medium;

public class is121Array {
    public static void main(String[] args) {
        System.out.println(is121Arrays(new int[] {1, 1, 1}));
        System.out.println(is121Arrays(new int[] {1, 2, 1}));
        System.out.println(is121Arrays(new int[] {1, 1, 2, 2, 2, 1, 1}));
        System.out.println(is121Arrays(new int[] {3, 1, 1, 2, 2, 2, 1, 1, 1}));
        System.out.println(is121Arrays(new int[] {1,2,2,2,2,2,1}));
        System.out.println(is121Arrays(new int[] {1, 1, 1, 1, 1, 1}));
        System.out.println(is121Arrays(new int[] {2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1}));
        System.out.println(is121Arrays(new int[] {1, 1, 1, 2, 2, 2, 1, 1, 2, 2}));
        System.out.println(is121Arrays(new int[] {2, 2, 2}));
    }
    static int is121Arrays(int[] a) {
        int return121Arrays = 1;
        //int middleTwos = 0;
        int leftOnes = 0, rightOnes = 0;

        if(a.length < 3) return 0;

        for (int i = 0, j = a.length - 1; i < j; i++, j--) {
            if (a[i] == 1) {
                leftOnes++;
            }
            if (a[j] == 1) {
                rightOnes++;
            }
        }

        if (rightOnes !=0 && leftOnes == rightOnes && a.length - (leftOnes + rightOnes) > 0) {
            for (int i = leftOnes; i < a.length - rightOnes; i++) {
                if (a[i] != 2) {
                    return121Arrays = 0;
                    break;
                }
            }
        } else {
            return121Arrays = 0;
        }

        return return121Arrays;
    }
}
