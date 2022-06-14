package medium;

public class SuperArrayV2 {
    public static void main(String[] args) {
        //int[] a = {2, 3, 6, 13};
        int[] a = {2, 3, 6, 1};
        System.out.println(isSuperArray(a));
    }
    static int isSuperArray(int[] a) {
        int isSuper = 1;
        int sum = 0;
        for(int i = 0; i < a.length-1; i++) {
            sum += a[i];
            if(sum >= a[i +1]) {
                isSuper = 0;
                break;
            }
        }
        return isSuper;
    }
}
