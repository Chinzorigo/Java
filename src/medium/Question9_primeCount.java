package medium;

public class Question9_primeCount {
    public static void main(String[] args) {
        int start = -10, end = 6;
        System.out.println(primeCount(start, end));
    }
    static int primeCount(int start, int end) {
        int pCount = 0;
        for (int i = start; i <= end; i++) {

            if(isPrimeNumber(i) == 1 && i > 0) {
                System.out.println(i);
                pCount++;

            }
        }
        if(pCount != 0) {
            return pCount;
        }
        return 0;

    }

    public static int isPrimeNumber(int num) {
        int isPrime = 1;
        //condition for non-prime number
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
