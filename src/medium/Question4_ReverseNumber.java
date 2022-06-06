package medium;

public class Question4_ReverseNumber {
    public static void main(String[] args) {
        int n = 35;
        System.out.println(f(n));
    }

    static int f(int n) {
        int reversed = 0;
        while (n != 0) {
            int remainder = n % 10;
            reversed = reversed * 10 + remainder;
            n /= 10;

        }

        return reversed;
    }
}
