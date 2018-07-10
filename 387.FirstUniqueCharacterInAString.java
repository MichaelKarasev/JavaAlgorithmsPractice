class Solution {
    public int firstUniqChar(String s) {
        HashSet<Character> set = new HashSet<>(); 
        if (s.length() == 1){
            return 0;
        }
        for (int i = 0; i < s.length(); i++){
            for (int j = i + 1; j < s.length(); j++){
                if (s.charAt(i) == s.charAt(j)){
                    break;
                }
                if (j == (s.length() - 1) && !set.contains(s.charAt(i))){
                    return i;
                }
            }
            if (i == (s.length() - 1) && !set.contains(s.charAt(i))){
                return i;
            }
            if (!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
            }
        }
        return -1;
    }
}