class Solution {
    public int trap(int[] height) {
     int left=0;
        int right=height.length-2;
        
        //Max of left and right pointers
        
        int MaxL=0;
        int MaxR=0;
        
        int res=0;
        
        while(left<=right)
        {
            if(MaxL<=MaxR)
            {
               res+=Math.max(0,MaxR-height[right]);
                
               MaxR=Math.max(MaxR,height[right]);
                
               right-=1; 
            }
            else
            {
                res+=Math.max(0,MaxL-height[left]);
                
                MaxL=Math.max(MaxL,height[left]);
                
                left+=1;
            }
        }
        
        return res;
       
    }
}
