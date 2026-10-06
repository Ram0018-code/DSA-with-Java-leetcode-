class Solution {
    public void moveZeroes(int[] nums) {
       int n = nums.length;
       int s = 0;
       for ( int e = 0 ; e<n ; e++){
        if (nums[e]!= 0){
            int temp = nums[e];
            nums[e]=nums[s];
            nums[s]=temp;
            s++;
            
        }
       
       }
    }
}