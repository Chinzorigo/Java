package medium;

public class max {
    public static void main(String[] args) {
        int[] a = {3,1,1,1,1,1,1,1,4, -1,1,2};
        System.out.println(isMax(a));
    }

    static int isMax(int[] a) {
        int countMax = 0;
        int maxNumber = 0;

        for(int i: a) {
            if(countMax == 0) {
                maxNumber = i;
                countMax++;
            }


            if(maxNumber < i) {
                maxNumber = i;
            }
        }

        return maxNumber;
    }


}
