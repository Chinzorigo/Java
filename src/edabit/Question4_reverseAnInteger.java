package edabit;

public class Question4_reverseAnInteger {
    public static void main(String[] args) {
        //int n = 1234;
        int n = -123;

        System.out.println(f(n));
    }

    static int f(int n) {
        int reversed = 0;

        while(n !=0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;

            n /= 10;
        }

        return reversed;
    }
}
