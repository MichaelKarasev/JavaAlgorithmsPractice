class Solution {
    public int titleToNumber(String s) {
        int res = 0;
        for (int i = 0; i <  s.length(); i++){
            char ch = s.charAt(s.length() - i - 1);
            double num = Math.pow(26, i) * (ch - 'A' + 1);
            res += num;
        }
        return res;
    }
}