class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String revs = new StringBuilder(s).reverse().toString();
        if (revs.compareTo(s) == 0){
            return true;
        }
        return false;
    }
}