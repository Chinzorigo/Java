package medium;

public class Question7_nextPerfectSquare {
    public static void main(String[] args) {
        //int a = 30;
        //int a = 36;
        //int a = 0;
        int a = -5;
        System.out.println(isPerfectSquare(a));
    }
    static int isPerfectSquare(int a) {
        int nextPerfectSquare = 0;

        if (a >= 0) {
            double sqrtResult = Math.sqrt(a);
            int baseNumber = (int) sqrtResult;
            int nextNumber = baseNumber + 1;
            nextPerfectSquare = (int) Math.pow(nextNumber, 2);
        }

        return nextPerfectSquare;
        /*
        int square;
        for(int i = a - a -1; i <= a; i++) {
            square = i * i;
            if(square > a) return square;
        }
        return 0;

         */
    }
}
