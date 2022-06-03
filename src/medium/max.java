package medium;

public class max {
    public static void main(String[] args) {
        int[] a = {3,1,1,1,1,1,1,1,1,2};
        int max = a[0];
        System.out.println(max);
        for (int i : a) {
            if (max < i) {
                max = i;
            }
        }
        System.out.println(max);
    }
}
