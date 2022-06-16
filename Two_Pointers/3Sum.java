//Note: This array is unsorted and has duplicates

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        //finding the first value and then finding the other two values trhough two sum
        
        Arrays.sort(nums); //Sorting the array for easier identification of duplicates
        
        LinkedList<List<Integer>> output=new LinkedList<List<Integer>>();
        
        for(int i=0;i<nums.length-2; i++)
        {
            if(i==0 || (i>0 && nums[i]!=nums[i-1])) //if i is the first number or i is not the first number and i's previous number is not equal to i
            {
              int target=0-nums[i]; //creating the target variable for TwoSum
                
              //Variables for TwoSum 
              int left=i+1;
              int right=nums.length-1;
                
                while(left<right)
                {
                   if(nums[left]+nums[right]==target)
                {
                    ArrayList<Integer> SubOutput=new ArrayList<>();
                      
                    SubOutput.add(nums[i]);
                    SubOutput.add(nums[left]); 
                    SubOutput.add(nums[right]);
                    output.add(SubOutput);
                       
                    while(left<right && nums[left]==nums[left+1])  //avoiding duplicates for the left pointer
                    {
                       left++; 
                    }
                       
                     while(left<right && nums[right]==nums[right-1]) //avoiding duplicates for the right pointer
                    {
                       right--;  
                    }
                       
                     left++;
                     right--;  
                        
                    }
                    else if(nums[left]+nums[right]>target)
                    {
                        right--;
                    }
                    else
                    {
                        left++;
                    }
                }
            }
        }
        
        return output;
    }
}
