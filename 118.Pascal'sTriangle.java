class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 1; i <= numRows; i++){
            List<Integer> toadd = new ArrayList<>();
            if (i == 1 || i == 2){
                toadd.add(1);
                if (i == 2){
                    toadd.add(1);
                }
                res.add(toadd);
            }
            else{
                toadd.add(1);
                List<Integer> getfrom = res.get(i - 2);
                for (int j = 0; j < i - 2; j++){
                    toadd.add(getfrom.get(j) + getfrom.get(j + 1));
                }
                toadd.add(1);
                res.add(toadd);
            }
        }
        return res;
    }
}