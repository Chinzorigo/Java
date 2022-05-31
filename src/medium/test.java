package medium;

public class test {
    public static void main(String[] args) {
        int[] a = {8,4,2,1};
        System.out.println(isGuthrieSequence(a));
    }

    static int isGuthrieSequence(int[] a) {
        int length = a.length;

        if(a[length-1] != 1) {
            return 0;
        }

        for (int idx = 0; idx < length-1; idx++) {
            if(a[idx] % 2 == 0) {
                if(a[idx+1] != a[idx] / 2) {
                    return 0;
                }

            } else {
                if(a[idx+1] != 3 * a[idx] + 1) {
                    return 0;
                }

            }
        }

        return 1;
    }
}