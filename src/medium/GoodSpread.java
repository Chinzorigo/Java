package medium;

public class GoodSpread {
    public static void main(String[] args) {
        int[] a = {2, 1, 2, 2, 1, 9, 5, 5,5,5};
        System.out.println(isGoodSpread(a));
    }

    static int isGoodSpread(int[] a) {
        int isSpread = 1;
        for(int i=0; i < a.length-1; i++) {
            int countThree = 1;
            for (int j = i + 1; j < a.length; j++){
                if(a[i] == a[j]) {
                    countThree++;
                }
            }
            if (countThree > 3) {
                isSpread = 0;
                break;
            }

        }
        return isSpread;
    }
}
