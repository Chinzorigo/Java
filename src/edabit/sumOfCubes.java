package edabit;

public class sumOfCubes {
    public static void main(String[] args) {
        int[] nums = {1, 5, 9};
        System.out.println(sumOfCubes(nums));
    }

    public static int sumOfCubes(int[] nums) {
        int sum = 0;
        for(int s: nums) {
            sum += Math.pow(s,3);
        }
        return sum;
    }
}
