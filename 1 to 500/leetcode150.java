
DATE : 01-April-2026
LEVEL : Medium
TOPIC : Stack

class Solution {

    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for(String t:tokens){
            if(t.equals("+")||t.equals("-")||t.equals("*")||t.equals("/")){
                int b=s.pop();
                int a=s.pop();
                int res=0;
                switch(t){
                    case "+" : res=a+b; break;
                    case "-" : res=a-b; break;
                    case "*" : res=a*b; break;
                    case "/" : res=a/b; break;
                }
                s.push(res);
            }else{
                s.push(Integer.parseInt(t));
            }
        }
        return s.pop();
    }
}