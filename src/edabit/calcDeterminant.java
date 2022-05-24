package edabit;

public class calcDeterminant {
    public static void main(String[] args) {
        int ages[][] = {
                {12, 24},
                {35, 23}
        };

        System.out.println(determinant(ages));

    }

    static int determinant(int[][] ages) {
        return (ages[0][0] + ages[1][1]) - (ages[0][1] + ages[1][0]);
    }
}
