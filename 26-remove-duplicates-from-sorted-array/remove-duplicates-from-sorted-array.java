class Solution {
    public int removeDuplicates(int[] nums) {
        int s = 0;
        int e = 1;
        while ( e<nums.length){
            if ( nums[s]==nums[e]){
                e++;
            }else {
                s++;
                nums[s]=nums[e];
                e++;
            }
        }
        return s+1;
    }
    }