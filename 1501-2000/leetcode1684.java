class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        int freq[]=new int[26];
        for(int i=0;i<allowed.length();i++){
            freq[allowed.charAt(i)-'a']=1;
        }

        for(String word:words){
            boolean isValid=true;
            for(int i=0;i<word.length();i++){
                if(freq[word.charAt(i)-'a']==0){
                isValid=false;
                break;
                }
            }
            if(isValid){
            count++;
            }
        }
        return  count;
    }
}