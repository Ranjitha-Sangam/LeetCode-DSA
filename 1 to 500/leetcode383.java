
DATE : 20-FEB-2026
LEVEL : Easy
TOPIC : HashMap

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char m:magazine.toCharArray()){
            map.put(m,map.getOrDefault(m,0)+1);
        }
        for(char r:ransomNote.toCharArray()){
            if(!map.containsKey(r) || map.get(r)==0){
                return false;
            }
            map.put(r,map.get(r)-1);
        }
        return true;
    }
}



DATE : 20-FEB-2026
LEVEL : Easy
TOPIC : String


class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26];
        for ( char ch : magazine.toCharArray()){
            freq[ch-'a']++;
        }
        for ( char ch : ransomNote.toCharArray()){
            if(freq[ch-'a'] == 0){
                return false;
            }
            freq[ch-'a']--;
        }
        return true;
    }
}