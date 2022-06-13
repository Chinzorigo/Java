package medium;

public class OddValent {
    public static void main(String[] args) {
        //int[] a = {3,3,3,3,3,3,3};
        int[] a = {2, 4, 7, 6, 5, 5};
        System.out.println(isOddValent(a));
    }

    static int isOddValent(int[] a) {
        int countOdd = 0;
        int countOccurs = 0;
        for(int i: a) {
            if(i % 2 == 1) {
                countOdd++;
            }
        }
        for(int i = 0; i < a.length-1; i++) {
            for(int j = i+1; j < a.length; j++) {
                if(a[i] == a[j]) {
                    countOccurs++;
                }
            }
            if(countOccurs >= 1) break;
        }

        if(countOdd >= 1 && countOccurs >= 1) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
