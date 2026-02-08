
DATE : 08-FEB-2026
LEVEL : Easy
TOPIC : Strings

class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
            String word=words[i];
            char first=word.charAt(0);
            char last=word.charAt(word.length()-1);
            if(isVowel(first) && isVowel(last)){
                count++;
            }
        }
        return count;
    }
    private boolean isVowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';

    }
}