class Solution {
    public int maxArea(int[] height) {
        
        int left=0;
        
        int right=height.length-1;
        
        int farea=0;
        
        while(left<right)
        {
            int Clength=right-left;
            
            int area=Clength*Math.min(height[left],height[right]);
            
            farea=Math.max(farea,area);
            
            if(height[left]<height[right])
            {
                left++;
            }
            else{
                right--;
            }
        }
        
        return farea;
    }
}
