package medium;

public class NiceArray {
    public static void main(String[] args) {
        //int[] a = {2, 10, 9, 3, 55};
        //int[] a = {2, 2, 3, 3, 3};
        //int[] a = {1, 1, 1, 2, 1, 1};
        int[] a = {0, -1, 1};
        System.out.println(isNiceArray(a));
    }
    static int isNiceArray(int[] a) {
        int isNice = 1;

        for (int k : a) {
            int methodCount = 0;
            for (int i : a) {
                if (k == i + 1 || k == i - 1) {
                    methodCount++;
                }
            }
            if (methodCount == 0) {
                isNice = 0;
                break;
            }
        }
        return isNice;
    }
}
