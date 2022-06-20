package basic;

public class PrimeHappy {
    public static void main(String[] args) {

        System.out.println(isPrimeHappy(32));
    }

      static int isPrimeHappy(int n) {
        int sumOfPrime = 0;
        int countOfPrime = 0;
        for (int i = 2; i < n; i++) {

            if(isPrimeNumber(i) == 1) {
                sumOfPrime += i;
                countOfPrime++;

            }
        }
        if(sumOfPrime % n == 0 && countOfPrime > 0) {
            return 1;
        }
        return 0;

    }

    public static int isPrimeNumber(int num) {
        int isPrime = 1;

        if(num <= 1) {
            isPrime = 0;
            return isPrime;
        }
        for (int idx = 2; idx <= num / 2; idx++) {
            if (num % idx == 0) {
                isPrime = 0;
                break;
            }


        }

        return isPrime;
    }
}
