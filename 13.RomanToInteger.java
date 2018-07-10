class Solution {
    public int romanToInt(String s) {
        String chararr = s;
        int i = 0;
        int result = 0;
        while(i < chararr.length()){
            if(chararr.charAt(i) == 'I'){
                if ((i + 1) < chararr.length()){
                    if ((chararr.charAt(i+1) == 'V') || (chararr.charAt(i+1) == 'X')){
                        result--;
                        i++;
                        continue;
                    }
                }
                result++;
            }
            if(chararr.charAt(i) == 'V'){result+=5;}
            if(chararr.charAt(i) == 'X'){
                if ((i + 1) < chararr.length()){
                    if ((chararr.charAt(i+1) == 'L') || (chararr.charAt(i+1) == 'C')){
                        result-=10;
                        i++;
                        continue;
                    }
                }
                result+=10;
            }
            if(chararr.charAt(i) == 'L'){result+=50;}
            if(chararr.charAt(i) == 'C'){
                if ((i + 1) < chararr.length()){
                    if ((chararr.charAt(i+1) == 'D') || (chararr.charAt(i+1) == 'M')){
                        result-=100;
                        i++;
                        continue;
                    }
                }
                result+=100;
            }
            if(chararr.charAt(i) == 'D'){result+=500;}
            if(chararr.charAt(i) == 'M'){result+=1000;}
            i++;
        }
        return result;
    }
}