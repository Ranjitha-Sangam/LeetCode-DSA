
DATE : 27-FEB-2026
LEVEL : Easy
TOPIC : Greedy

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int contentChild=0;
        int i=0;
        int j=0;
        while(i<g.length && j<s.length){
            if(g[i]<=s[j]){
                contentChild++;
                i++;
                j++;
            }else{
                j++;
            }
        }
        return contentChild;
    }
}