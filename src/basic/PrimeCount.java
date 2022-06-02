package basic;

public class PrimeCount {
    public static void main(String[] args) {

        int low = -26, high = 6;
        System.out.println(countPrime(low,high));

    }

    static int countPrime(int low, int high) {
        int count = 0;
        while (low < high) {
            int flag = 0;
            count = 0;
            if (low <= 0) {
                return flag;
            }
            for (int i = 2; i <= low / 2; ++i) {
                // condition for nonprime number
                if (low % i == 0) {
                    flag = 1;
                    break;
                }
            }

            if (flag != 1 && low != 0 && low <= 1)
                count++;

            ++low;
        }

        return count;
    }

}
