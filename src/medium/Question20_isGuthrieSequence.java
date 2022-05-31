package medium;

public class Question20_isGuthrieSequence {
    public static void main(String[] args) {
        int[] a = {8,4,2,1};
        System.out.println(isGuthrieSequence(a));
    }
    static int isGuthrieSequence(int[] a) {
        int length = a.length;

        if (a[length - 1] != 1) {
            return 0;
        }
        for (int i = 0; i < length - 1; i++) {
            if (a[i] % 2 == 0) {
                if (a[i + 1] != a[i] / 2) {
                    return 0;
                }

            } else {

                if (a[i + 1] != 3 * a[i] + 1) {
                    return 0;
                }

            }
        }
        return 1;
    }
}
