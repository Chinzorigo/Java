package edabit.very_easy;

public class TwoMakesTen {
    public static void main(String[] args) {
        System.out.println(PerValueOrSum(9, 10));
    }

    static boolean PerValueOrSum(int a, int b) {
        if(a == 10 || b == 10 || a + b == 10) {
            return true;
        } else {
            return false;
        }
    }
}
