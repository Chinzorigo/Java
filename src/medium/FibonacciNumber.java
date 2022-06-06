package medium;

public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(isFibonacci(21));
    }
    static int isFibonacci(int a) {
        int num = 0;
        int firstNumber = 0;
        int secondNumber = 1;
        while (num < a) {
            num = firstNumber +secondNumber;
            firstNumber = secondNumber;
            secondNumber = num;

        }
        if(a == num) {
            return 1;
        } else {
            return 0;
        }

    }
}
