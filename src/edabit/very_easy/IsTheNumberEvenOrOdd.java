package edabit.very_easy;

public class IsTheNumberEvenOrOdd {
    public static void main(String[] args) {
        System.out.println(isEvenOrOdd(140));
    }

    static String isEvenOrOdd(int num) {
        if(num % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }
}
