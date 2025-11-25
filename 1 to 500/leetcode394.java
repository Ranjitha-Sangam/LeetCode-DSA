
DATE : 25-NOV-2025
LEVEL : Medium
TOPIC : Stack

class Solution {
    public String decodeString(String s) {
        Stack<Integer> numStack=new Stack<>();
        Stack<StringBuilder> strStack = new Stack<>();
        StringBuilder curr = new StringBuilder();
        int num=0;

        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                num=num*10+(c-'0');
            }else if(c=='['){
                numStack.push(num);
                strStack.push(curr);
                num=0;
                curr=new StringBuilder();
            }else if(c==']'){
                int times=numStack.pop();
                StringBuilder prev=strStack.pop();

                for(int i=0;i<times;i++){
                    prev.append(curr);
                }
                curr=prev;
            }
            else{
                curr.append(c);
            }
        }
        return curr.toString();
    }
}