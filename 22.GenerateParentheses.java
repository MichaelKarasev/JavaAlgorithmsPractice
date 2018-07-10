class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> arr = new ArrayList<>();
        genParRec(arr, "", 0, 0, n);
        return arr;
    }
    
    public void genParRec(List<String> arr, String str, int opened, int closed, int n){
        if (str.length() == n*2){
            arr.add(str);
            return;
        }
        if (opened < n){
            genParRec(arr, str + "(", opened + 1, closed, n);
        }
        if (closed < opened){
            genParRec(arr, str + ")", opened, closed + 1, n);
        }
    }
}