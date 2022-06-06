package medium;

public class Paired {
    public static void main(String[] args) {
        System.out.println(isPaired(new int[] {7, 2, 3, 6, 7, 4}));
        System.out.println(isPaired(new int[] {2, 2, 3, 6, 7, 4}));
    }

    static int isPaired(int[] a) {
        boolean evenIndex = true, oddIndex = true;
        for(int i = 0; i < a.length; i++) {
            if(i % 2 == 0) {
                if(a[i] % 2 == 0) {
                    evenIndex = false;
                }
            } else {
                if(a[i] % 2 == 1) {
                    oddIndex = false;
                }
            }
        }
        if(evenIndex && oddIndex) {
            return 1;
        } else {
            return 0;
        }
    }
}
