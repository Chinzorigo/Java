package edabit.very_easy;

public class LetsFuelUp {
    public static void main(String[] args) {
        System.out.println(calculateFuel(14));

    }

    public static double calculateFuel(double n) {

        if(n <= 10) {
            return 100;
        } else {
            return n * 10;
        }
    }
}
