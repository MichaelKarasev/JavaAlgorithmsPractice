class Solution {
    public int rob(int[] nums) {
        int prevMax = 0;
        int curMax = 0;
        for (int i = 0; i < nums.length; i++){
            int temp = curMax;
            curMax = Math.max(prevMax + nums[i], curMax);
            prevMax = temp;
        }
        return curMax;
    }
}