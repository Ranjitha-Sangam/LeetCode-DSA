
DATE : 09-FEB-2026
LEVEL : Easy
TOPIC : HashSet

class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count=0;
        HashSet<String> set = new HashSet<>();
        for(String word:words){
            String rev=new StringBuilder(word).reverse().toString();
            if(set.contains(rev)){
                count++;
            }
            set.add(word);
        }
        return count;
    }
}