
DATE : 26-FEB-2026
LEVEL : Easy
TOPIC : Math

class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxDiag=0;
        int maxArea=0;

        for(int[] d: dimensions){
            int l=d[0];
            int w=d[1];

            int diag=l*l + w*w;
            int area=l*w;
            if(diag>maxDiag){
                maxDiag=diag;
                maxArea=area;
            }else if(diag==maxDiag){
                maxArea=Math.max(maxArea,area);
            }
        }
        return maxArea;
    }
}