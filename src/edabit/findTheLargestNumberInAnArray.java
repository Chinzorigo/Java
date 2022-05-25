package edabit;

public class findTheLargestNumberInAnArray {
    public static void main(String[] args) {
        int[] nums = {4, 5, 1, 3};
        System.out.println(findLargestNum(nums));
    }
    public static int findLargestNum(int[] nums) {
        int max = 0;
        for(int idx: nums)
            if(idx >= max)
                max = idx;
        return max;
    }
}
