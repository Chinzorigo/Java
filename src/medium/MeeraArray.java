package medium;

public class MeeraArray {
    public static void main(String[] args) {
        int[] a = {4, 8, 6, 3, 2, 9, 8,11, 8, 13, 12, 12, 6,2};
        System.out.println(isMeeraArray(a));
    }

    static int isMeeraArray(int[] a) {
        int isMeera;
        int atLeastOneOdd = 0;
        int sumOfLeftEven = 0;
        int sumOfRightEven = 0;

        for (int j : a) {
            if (j % 2 != 0) {
                atLeastOneOdd = 1;
                break;
            }
        }
        if(atLeastOneOdd == 0) return 0;

        for (int j : a) {
            if (j % 2 == 0) {
                sumOfLeftEven++;
            } else {
                break;
            }
        }
        for(int i = a.length-1; i >= 0; i--) {
            if (a[i] % 2 == 0) {
                sumOfRightEven++;
            } else {
                break;
            }
        }
        System.out.println("Right even: " + sumOfRightEven);
        System.out.println("Left even: " + sumOfLeftEven);

        if(sumOfLeftEven == sumOfRightEven) {
            isMeera = 1;
        } else {
            isMeera = 0;
        }
        return isMeera;

    }
}
