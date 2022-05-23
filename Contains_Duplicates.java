//Basic Solution:

class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> hashset = new HashSet<Integer>();
        
        for(int i: nums)
        {
            hashset.add(i);
        }
        
        if(hashset.size()==nums.length)  //Comapring length of hashset and nums to see if there are duplicates.
        {
            return false;
        }
        else
        {
            return true;
        }
        
    }
}

//Optimized Solution:

class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Set<Integer> hs=new HashSet<Integer>();
        
        for(int i: nums)
        {
            if(hs.contains(i))   //While adding elements to the hashset,check the hashset to see if it already contains the number that is being added--Duplicate
            {
                return true;
            }
          
            hs.add(i);
        }
        
        return false;
        
    }
}
