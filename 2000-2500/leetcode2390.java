
DATE : 05-April-2026
LEVEL : Medium
TOPIC : Stack

class Solution {
    public String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='*'){
                st.pop();
            }else{
                st.push(c);
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}


DATE : 05-April-2026
LEVEL : Medium
TOPIC : StringBuilder


public String removeStars(String s) {
    StringBuilder sb=new StringBuilder();
    for(char c:s.toCharArray()){
        if(c=='*'){
            sb.deleteCharAt(sb.length()-1);
        }else{
            sb.append(c);
        }
    }
    return sb.toString();
}