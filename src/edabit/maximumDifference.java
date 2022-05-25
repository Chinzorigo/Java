package edabit;

public class maximumDifference {
    public static void main(String[] args) {
        int[] nums = {1, 15, 14, 20, 10, 6};
        System.out.println(challenge(nums));
    }

    public static int challenge(int[] nums) {
        /*Arrays.sort(nums);
        return nums[nums.length-1] - nums[0];
        */
        for(int idx = 0; idx < nums.length; idx++) {
            for(int jdx = idx +1; jdx < nums.length; jdx++) {
                int temp;
                if(nums[jdx] <= nums[idx]) {
                    temp = nums[idx];
                    nums[idx] = nums[jdx];
                    nums[jdx] = temp;
                }
            }
        }
        return nums[nums.length-1] - nums[0];

    }
}
