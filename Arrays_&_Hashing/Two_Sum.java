/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.*/




//Optimized Solution:

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] output=new int[2];
        
        Map<Integer, Integer> hmap=new HashMap<Integer, Integer>(); //Hash Map
        for(int i=0;i<nums.length;i++)
        {
            int Supposedj=hmap.getOrDefault(target-nums[i],-1);  //target= A[i] + A[j]
          
          ////return default val(-1) if value is not mapped with the key
            
            if(Supposedj>-1)
            {
                output[1]=i;
                output[0]=Supposedj;
                break;
            }
            
            hmap.put(nums[i],i);
        }
        
        return output;
        
    }
}
