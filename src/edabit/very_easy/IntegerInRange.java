package edabit.very_easy;

public class IntegerInRange {
    public static void main(String[] args) {
        System.out.println(intWithinBounds(4, 1, -9));
    }
     static boolean intWithinBounds(int n, int lower, int upper) {
         return n >= lower && n < upper;
    }
}
