
DATE : 12-JAN-2026
LEVEL : Medium
TOPIC : Tries

class Solution {
    class Node{
        Node children[]=new Node[26];
        boolean eow;
    }
    Node root = new Node();
    public String replaceWords(List<String> dictionary, String sentence) {
        for(String word:dictionary){
            insert(word);
        }
        StringBuilder res= new StringBuilder();
        for(String word:sentence.split(" ")){
            res.append(findRoot(word)).append(" ");
        }
        return res.toString().trim();
    }
    private void insert(String word){
        Node curr=root;
        for(char c:word.toCharArray()){
            int idx=c-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }
            curr=curr.children[idx];
        }
        curr.eow=true;
    }
    private String findRoot(String word){
        Node curr=root;
        StringBuilder prefix= new StringBuilder();
        for(char c:word.toCharArray()){
            int idx=c-'a';
            if(curr.children[idx]==null){
                return word;
            }
            prefix.append(c);
            curr=curr.children[idx];
            if(curr.eow){
                return prefix.toString();
            }
        }
        return word;
    }
}

//for last return if dictionary = ["cattle"]
// word = "cattle" why we have to covert prefix to string we can directly return word
