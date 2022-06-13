package medium;

public class OddValentV3 {
    public static void main(String[] args) {
        //int[] a = {3,3,3,3,3,3,3};
        int[] a = {3, 8, 4, 10, 6, 3};
        System.out.println(isOddValent(a));
    }

    static int isOddValent(int[] a) {
        int countOccurs = 0;
        boolean isOdd = false;
        for(int i = 0; i < a.length; i++) {
            int countOdd = 0;
            for(int j = a.length-1; j > i; j--) {
                if(a[i] % 2 == 1 || a[j] % 2 == 1) {
                    countOdd++;
                    if(countOdd > 0){
                        isOdd = true;
                    }
                }
                if(a[i] == a[j]) {
                    countOccurs++;
                }
            }
            if(countOccurs >= 1) break;
        }

        if(isOdd && countOccurs >= 1) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
