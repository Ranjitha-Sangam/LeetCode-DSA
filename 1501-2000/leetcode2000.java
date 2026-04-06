
DATE : 06-April-2026
LEVEL : Easy
TOPIC : Stack

class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> s=new Stack<>();
        int idx=0;
        if(word.indexOf(ch)==-1){
            return word;
        }
        while(word.charAt(idx)!=ch){
            s.push(word.charAt(idx));
            idx++;
        }
        s.push(ch);
        StringBuilder result=new StringBuilder();
        while(!s.isEmpty()){
            char curr=s.pop();
            result.append(curr);
        }
        int currIdx=idx+1;
        while(currIdx<word.length()){
            result.append(word.charAt(currIdx));
            currIdx++;
        }
        return result.toString();
    }
}

DATE : 06-April-2026
LEVEL : Easy
TOPIC : String Manipulation

class Solution {
    public String reversePrefix(String word, char ch) {
        int idx=word.indexOf(ch);
        if(idx==-1) return word;
        StringBuilder sb=new StringBuilder(word.substring(0,idx+1));
        sb.reverse();
        sb.append(word.substring(idx+1));

        return sb.toString();
    }
}