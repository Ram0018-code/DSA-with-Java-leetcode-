import java.util.*;
class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int maxwater = 0;
        while ( l<r){
           int w = r-l;
           int h = Math.min (height[l],height[r]);
           int curw = w*h;
           maxwater = Math.max(curw , maxwater);
           if (height[l]<height[r]){
            l ++;
           }
           else{
            r--;
           }
            
        }
        return maxwater;
        
    }
}