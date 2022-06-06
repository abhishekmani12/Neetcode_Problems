class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int length=nums.length;
        
        int[] output=new int[length];
        
        //Calculating the prefix product for each number and storing it in output array
        
        int prefix=1;
        
        for(int i=0;i<length;i++)
        {
            output[i]=prefix;
            
            prefix=prefix*nums[i];
        }
        
        
        //calculating the postfix product for each number and multiplying it to the prefix products stored in the output array.
         
        int postfix=1;
        
        for(int i=length-1;i>=0;i--)
        {
            
            output[i]=output[i]*postfix;
            
            postfix=postfix*nums[i];
        }
        
        return output;
        
    }
}
