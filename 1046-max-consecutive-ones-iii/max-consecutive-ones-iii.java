class Solution {
    public int longestOnes(int[] nums, int k) {
     int l = 0;
     int zeroc = 0;
     for ( int r = 0; r<nums.length; r++){
        if ( nums[r]==0){
            zeroc++;
        }
            if (zeroc > k){
                if (nums[l]==0){
                   zeroc--;
                }
                l++;
            }
           
        
        
     }  
     return nums.length - l; 
    }
}