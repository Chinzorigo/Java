package edabit;

public class checkFactors {
    public static void main(String[] args) {
        int[] factors = {1, 2, 3, 8, 4};
        int num = 12;
        System.out.println(checkFactors(factors, num));
    }

    public static boolean checkFactors(int[] factors,int num) {
        for (int i:factors)
            if(num%i!=0)
                return false;
        return true;


        /*        boolean result = false;
        for(int idx = 0; idx < factors.length; idx++) {
            if (num % factors[idx] == 0) {
                result = true;

            } else {
                result = false;
                break ;
            }

        }
        return result;

 */
    }
}
