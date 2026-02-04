
DATE : 04-FEB-2026
LEVEL : Easy
TOPIC : Set

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        int res[]=new int[Math.min(nums2.length,nums1.length)];
        for(int n:nums1){
            set.add(n);
        }
        int idx=0;
        for(int num:nums2){
            if(set.contains(num)){
                res[idx++]=num;
                set.remove(num); //removes duplicate
            }
        }
        return Arrays.copyOf(res,idx);
    }
}
 //we can use 2 sets instead of array
//we used array of copy 
// Because the array we created is bigger than the actual answer