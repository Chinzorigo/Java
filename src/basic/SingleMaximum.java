package basic;

public class SingleMaximum {
    public static void main(String[] args) {
        System.out.println(hasSingleMaximum(new int[] {-6, -6, -6, -6, -6, -6}));
    }

    static int hasSingleMaximum(int[ ] a) {
        int countMax = 0;
        int maxNumber = 0;
        int assign = 0;

        if (a.length == 0) {
            return 0;
        }

        for (int i = 0; i < a.length; i++) {
            if (assign == 0) {
                maxNumber = a[i];
                assign++;
            }
            if (maxNumber < a[i]) {
                maxNumber = a[i];
                countMax = 1;
            } else if (maxNumber == a[i]) {
                countMax++;
            }
        }
        if(countMax > 1) {
            return 0;
        } else {
            return 1;
        }

    }
}
