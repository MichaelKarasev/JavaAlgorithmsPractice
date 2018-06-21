class Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        for (int i = 0; i < nums.length - 1; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    if (i < j){
                        output[0] = i;
                        output[1] = j;
                    }
                    else{
                        output[1] = i;
                        output[0] = j;
                    }
                }
            }
        }
    return output;
    }

    public static void main(String[] args){
        int[] nums = {2,7,11,15};
    	int target = 9;
    	Two_Sum foo = new Two_Sum();
    	int[] res = foo.twoSum(nums, target);
        for (int i = 0; i < res.length; i++){
		System.out.print(res[i]);
	}
	System.out.println();
    }
}


