package medium;

public class factorTwoCount {
    public static void main(String[] args) {
        int a = 48;
        System.out.println(isFactorTwoCount(a));
    }

    static int isFactorTwoCount(int a) {
        int factorCount = 0;

        while(a > 1) {
            if( a % 2 == 0) {
                a = a /2;
                factorCount++;
            }
            else {
                break;
            }
        }
        return factorCount;
    }
}
