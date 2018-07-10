class Solution {
    public boolean isHappy(int n){
        return isHappyLim(n, 0);
    }
    public boolean isHappyLim(int n, int k) {
        int res = 0;
        if (k > 100){
            return false;
        }
        while ((n % 10) < n){
            res += (n % 10) * (n % 10);
            n = n / 10;
        }
        res += (n % 10) * (n % 10);
        if (res == 1){
            return true;
        }
        else{
            return isHappyLim(res, k + 1);
        }
    }
}