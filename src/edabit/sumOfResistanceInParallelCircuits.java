package edabit;

public class sumOfResistanceInParallelCircuits {
    public static void main(String[] args) {
        int[] r = {6, 3};
        System.out.println(parallelResistance(r));
    }

    public static double parallelResistance(int[] r) {
        double sum = 0;
        for(int idx = 0; idx < r.length; idx++) {
            sum += Math.round(1/r[idx]);
        }
        double RTotal = Math.round(1 /sum) ;
        return Math.round(RTotal);
    }
}
