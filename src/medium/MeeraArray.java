package medium;

public class MeeraArray {
    public static void main(String[] args) {
        int[] a = {4, 8, 6, 3, 2, 9, 8,11, 8, 13, 12, 12, 6,2};
        System.out.println(isMeeraArray(a));
    }

    static int isMeeraArray(int[] a) {
        int isMeera = 1;
        int atLeastOneOdd = 0;
        int sumOfLeftEven = 0;
        int sumOfRightEven = 0;

        for(int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                atLeastOneOdd = 1;
            }
        }
        if(atLeastOneOdd == 0) return 0;

        for(int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
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

        if(atLeastOneOdd == 1 && sumOfLeftEven == sumOfRightEven) {
            isMeera = 1;
            return isMeera;
        } else {
            isMeera = 0;
            return isMeera;
        }

    }
}
