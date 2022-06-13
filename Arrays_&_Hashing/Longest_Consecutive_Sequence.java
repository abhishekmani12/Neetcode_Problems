class Solution {
    public int longestConsecutive(int[] nums)
        
        //Approach: the starting elements of each sequence will not have any left neighbours(Previous number) using a set
        
    {
    
        HashMap<Integer, Boolean> mapper=new HashMap<>();
        
        for(int i: nums)
        {
            mapper.put(i, true); //setting flags-true for each element which exists in nums.
            
        }
            
            int longest=0;
            
            for(int i:nums)
            {
                
                if(!mapper.get(i))  //if value of key(i)==true; continue
                {
                    continue;
                }
                
                
                mapper.put(i,false);
                
                int lenCounter=1;  //to find the length of the sequence
                int previous=i-1;  //previous number of 'i'
                int next=i+1;      //next number of 'i'
                
                while(mapper.containsKey(previous))   //checking if previous number exists
                {
                    mapper.put(previous, false);
                    previous--;
                    lenCounter++;
                }
                
                while(mapper.containsKey(next))      //checking if next number exists
                {
                    mapper.put(next, false);
                    
                    next++;
                    lenCounter++;
                }
                
                if(lenCounter> longest)  //serves as a max length function
                {
                    longest=lenCounter;
                }
            }
            return longest;
        
    }
}
