package medium;

public class allPossibilities {
    public static void main(String[] args) {
        int[] a = {1,2,3,0};
        System.out.println(isAllPosibilities(a));
    }
    static int isAllPosibilities(int[] a) {
        int isAllPosible;
        int countEqual = 0;

        for(int i: a) {
            for (int j = 0; j < a.length - 1; j++) {
                if (i == j) {
                    countEqual++;
                }
            }
        }
        if(countEqual == a.length-1) {
            isAllPosible = 1;
        } else {
            isAllPosible = 0;
        }
        return isAllPosible;
    }
}
