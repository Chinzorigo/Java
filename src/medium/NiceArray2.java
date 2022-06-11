package medium;

public class NiceArray2 {
    public static void main(String[] args) {
        int[] a = {2, 10, 9, 3};
        System.out.println(isNiceArray(a));
    }
    static int isNiceArray(int[] a) {

        for(int i = 0; i < a.length; i++) {
            boolean isNice = false;
            for(int j = 0; j < a.length; j++) {
                if(i == j) {
                    continue;
                }
                if(a[i] == a[j] -1 || a[i] == a[j] + 1) {
                    isNice = true;
                    break;
                }
            }
            if(!isNice) {
                isNice = false;
                return 0;
            }
        }
        return 1;

    }
}
