class Solution {
    public int singleNumber(int[] nums) {
        int result = nums[0];
        HashSet<Integer> myset = new HashSet<>();
        for (int i = 0; i < nums.length; i++){
            if(myset.contains(nums[i]) == false){
                myset.add(nums[i]);    
            }
            else{
                myset.remove(nums[i]);
            }
        }
        Iterator iterator = myset.iterator();
        while(iterator.hasNext()){
            result = (int) iterator.next();
        }
        return result;
    }
}