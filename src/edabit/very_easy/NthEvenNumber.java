package edabit.very_easy;

public class NthEvenNumber {
    public static void main(String[] args) {
        System.out.println(even(100));
    }

    static int even(int n) {
        int nthEven = 0;
        for(int i = 1; i <= n; i++) {

            if(i == n) {
                break;
            }
            nthEven += 2;
        }

        return nthEven;
    }
}
