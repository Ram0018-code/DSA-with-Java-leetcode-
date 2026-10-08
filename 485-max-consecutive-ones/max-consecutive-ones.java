class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currcount = 0;
        int maxcount = 0;
        for ( int i = 0; i<nums.length ; i++){
            if ( nums[i]==1){
                currcount ++;
            }
            else {
               
                maxcount = Math.max ( currcount, maxcount);
                 currcount = 0;
            }
        }
        return Math.max (currcount, maxcount);
    }
}