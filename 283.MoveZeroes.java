class Solution {
    public void moveZeroes(int[] nums) {
        int LastNonZero = 0;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                int temp = nums[LastNonZero];
                nums[LastNonZero] = nums[i];
                nums[i] = temp;
                LastNonZero++;
            }
        }
    }
}