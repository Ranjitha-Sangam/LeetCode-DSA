
DATE : 12-FEB-2026
LEVEL : Easy
TOPIC : Arrays

class Solution {
    public boolean digitCount(String num) {
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i=0;i<num.length();i++){
            char ch=num.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<num.length();i++){

            char digitChar=(char)(i+'0');
            int expected=num.charAt(i)-'0';
            int actual=map.getOrDefault(digitChar,0);

            if(actual!=expected){
                return false;
            }
        }
        return true;
    }
}