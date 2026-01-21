
DATE : 21-JAN-2026
LEVEL : Easy
TOPIC : String

class Solution {
    public boolean detectCapitalUse(String word) {
        int count=0;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(ch>='A'&&ch<='Z'){
                count++;
            }
        }
        //all uppercase or all lowercase
        if(count==word.length() || count==0){
            return true;
        }
        //first word uppercase
        if(count==1&&word.charAt(0)>='A'&&word.charAt(0)<='Z'){
            return true;
        }
        return false;
    }
}