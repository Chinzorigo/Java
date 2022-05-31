package medium;

public class question12IsBean {
    public static void main(String[] args) {
        int[] a = {7,3,10,3};
        System.out.println(isBean(a));
    }

    static int isBean(int[] a) {
        for(int idx = 0; idx < a.length; idx++){
            for(int jdx = 1; jdx < a.length; jdx++){
                if(a[idx] * 2 == a[jdx] || a[idx] * 2 + 1 == a[jdx] || a[idx] / 2 == a[jdx]) return 1;
            }
        }
        return 0;
    }
}
