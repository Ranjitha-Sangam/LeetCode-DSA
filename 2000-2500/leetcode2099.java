
DATE : 11-DEC-2025
LEVEL : Easy
TOPIC : Greedy

class solution{
    public int[]  maxSubsequence(int[]nums,int k){
        int n=nums.length;
        int arr[][]=new int[n][2];

        for(int i=0;i<n;i++){
            arr[i][0]=nums[i];
            arr[i][1]=i;
        }
        //desceding value sorting
        Arrays.sort(arr,(a,b)->b[0]-a[0]); 
        
        //take top K elements n sort(ascending) by index (to maintain subsequence order)
        int topK[][]=Arrays.copyOf(arr,k);
        Arrays.sort(topK,(a,b)->a[1]-b[1]);

        int ans[]=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=topK[i][0];
        }
        return ans;
    }
}
