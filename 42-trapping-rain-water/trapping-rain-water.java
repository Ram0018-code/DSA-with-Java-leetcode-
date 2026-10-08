class Solution {
    public int trap(int[] height) {
        int s = 0;
        int e = height.length - 1;
        int leftmax = 0;
        int rightmax = 0;
        int twater = 0;
        while (s<e){
            leftmax = Math.max (leftmax , height[s]);
            rightmax = Math.max (rightmax , height[e]);
            if ( leftmax < rightmax){
                 twater += leftmax - height[s];
                 s++;

            }
            else {
                twater += rightmax - height[e];
                e--;
            }
        }
        return twater;
    }
}