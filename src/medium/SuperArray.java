package medium;

public class SuperArray {
    public static void main(String[] args) {
        //int[] a = {2, 3, 6, 13};
        int[] a = {2, 3, 6, 12};
        System.out.println(isSuperArray(a));
    }
    static int isSuperArray(int[] a) {
        int isSuper = 1;
        for(int i = a.length-1; i >= 0; i--) {
            int sum = 0;
            for(int j = 0; j < i; j++) {
                sum += a[j];
            }
            if(sum >= a[i]) {
                isSuper = 0;
                break;
            }
        }
        return isSuper;
    }
}
