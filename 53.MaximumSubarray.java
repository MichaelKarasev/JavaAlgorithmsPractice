//Kodane algorithm
class Solution {
    public int maxSubArray(int[] nums) {
        int current_sum = nums[0];
        int global_sum = nums[0];
        for (int i = 1; i < nums.length; i++){
            current_sum = Math.max(nums[i], current_sum + nums[i]);
            if (current_sum > global_sum){
                global_sum = current_sum;
            }
        }
        return global_sum;
    }
}