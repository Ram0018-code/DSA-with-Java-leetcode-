class Solution {
    public void moveZeroes(int[] nums) {
       int s = 0 ;
       int e = 0;
       while (e<nums.length){
       if ( nums[e]==0){
        e++;
       }else {
   
        int temp = nums[s];
        nums[s]=nums[e];
        nums[e]=temp;
             s++;
        e++;
       }
       }
       
    }
}