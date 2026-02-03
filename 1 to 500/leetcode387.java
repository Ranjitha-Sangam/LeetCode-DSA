
DATE : 13-NOV-2025
LEVEL : Easy
TOPIC : Strings

class Solution {
    public int firstUniqChar(String s) {
        int freq[]=new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(freq[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
}

//USING HASHMAP

class Solution{
    public int firstUniqChar(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }

}