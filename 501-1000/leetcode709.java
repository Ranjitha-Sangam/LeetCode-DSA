
DATE : 13-JAN-2026
LEVEL : Easy
TOPIC : Strings

class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c:s.toCharArray()){
            if(c>='A'&&c<='Z'){
                sb.append((char)(c+32));
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

// 'A' to 'Z' → ASCII 65 to 90
// 'a' to 'z' → ASCII 97 to 122
// Difference = 32
// lowercase = uppercase + 32
