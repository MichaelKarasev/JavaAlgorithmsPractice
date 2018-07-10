class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        for (int i = 0; i < s.length(); i++){
            Set set1 = new HashSet();
            int maxint = 0;
            for (int j = i; (j < s.length()) && !(set1.contains(s.charAt(j))); j++){
                set1.add(s.charAt(j));
                maxint++;
            }
            if (maxint > max){
                max = maxint;
            }
        }
        return max;
    }
}