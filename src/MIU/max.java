package MIU;

public class max {
    public static void main(String[] args) {
        int[] a = {3,1,1,1,1,1,1,1,1,2};
        int max = a[0];
        System.out.println(max);
        for(int idx = 0; idx < a.length; idx++) {
            if(max < a[idx]) {
                max = a[idx];
            }
        }
        System.out.println(max);
    }
}
