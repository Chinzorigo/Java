package edabit;

public class absoluteSum {
    public static void main(String[] args) {
        int[] nums = {2, -1, -3, 4, 8};
        System.out.println(getAbsSum(nums));

    }

    public static int getAbsSum(int[] nums) {
        int sum = 0;
        for(int idx: nums) {
            if(idx < 0) idx *= -1;
            sum += idx;
        }
        return sum;
    }
}
