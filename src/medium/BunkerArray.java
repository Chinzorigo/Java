package medium;

public class BunkerArray {
    public static void main(String[] args) {
        System.out.println(isBunkerArray(new int[] {4, 9, 6, 7, 49}));
    }
    static int isBunkerArray(int[] a) {
        int isBunker = 0;
        for(int i = 0; i < a.length-1; i++) {
            if(a[i] % 2 == 1) {
                if(a[i]*a[i] == a[i+1]) {
                    isBunker = 1;
                }
            }
        }
        return isBunker;
    }
}
