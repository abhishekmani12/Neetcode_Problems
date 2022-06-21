class Solution {
    public int trap(int[] height) 
    
    {
      int left=0;
        int right=height.length-1;
        
        int leftMax=0;
        int rightMax=0;
        
        int res=0;
        
        while(left<=right)   
        {
            if(rightMax<=leftMax) //finding the min of of rightMax, leftMax---this is to find out the bottleneck and we don't care about the higher value
            {
                res+= Math.max(0, rightMax-height[right]);  //updating results if rmax-rightP is positive else default to zero (water can't be stored)
                    
                rightMax=Math.max(rightMax, height[right]); //updating rMax if rightP is higher than the current rMax
                
                right-=1; //updating rightP
            }
            
            else  //same with leftP and lMax
            {
                res+=Math.max(0, leftMax-height[left]);
                
                leftMax=Math.max(leftMax, height[left]);
                
                left+=1;
            }
        }
        
        return res;
    }
}
