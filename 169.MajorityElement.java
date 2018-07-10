class Solution {
    public int majorityElement(int[] nums) {
        HashSet<Integer> elems = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if (!elems.contains(nums[i])){
                elems.add(nums[i]);
                int reps = 1;
                for (int j = i + 1; j < nums.length; j++){
                    if (nums[j] == nums[i]){
                        reps++;
                    }
                }
                if (reps > (nums.length/2)){
                    return nums[i];
                }
            }
        }
        return 0;
    }
}