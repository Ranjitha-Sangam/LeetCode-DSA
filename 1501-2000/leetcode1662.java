
DATE : 19-JAN-2026
LEVEL : Easy
TOPIC : String 

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb=new StringBuilder();
        for(String w:word1)
        sb.append(w);

        StringBuilder sb1=new StringBuilder();
        for(String w:word2)
        sb1.append(w);

        return sb.toString().equals(sb1.toString());
        
    }
}