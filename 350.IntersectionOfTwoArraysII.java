class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++){
            if (map.get(nums1[i]) == null){
                map.put(nums1[i], 1);
            }
            else{
                map.put(nums1[i], map.get(nums1[i]) + 1);
            }
        }
        for (int i = 0; i < nums2.length; i++){
            if (map.get(nums2[i]) != null && map.get(nums2[i]) > 0){
                map.put(nums2[i], map.get(nums2[i]) - 1);
                arr.add(nums2[i]);
            }
        }
        int[] res = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++){
            res[i] = arr.get(i);
        }
        return res;
    }
}
