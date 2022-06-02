package basic;

public class PrimeNumber {
    public static void main(String[] args) {
        int number = 1;
        System.out.println(isPrimeNumber(number));
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
