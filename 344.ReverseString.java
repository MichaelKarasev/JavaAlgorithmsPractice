class Solution {
    public String reverseString(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            result.append(s.charAt(s.length() - i - 1));
        }
        return result.toString();
    }
}