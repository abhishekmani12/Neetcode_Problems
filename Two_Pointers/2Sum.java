class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        //Note: Array indexing starts from 1 here and is sorted in ascending order
        
        int leftPointer=0;
        
        int rightPointer=numbers.length-1;
        
        int leftNum,rightNum;
        
        while(leftPointer<rightPointer)
        {
            leftNum=numbers[leftPointer];  //Assigning left most and rightmost numbers in the arr to the respective pointers
            
            rightNum=numbers[rightPointer];
            
            if(leftNum+rightNum==target) //target is found
            {
                break;
            }
            
            if(leftNum+rightNum<target) //when result is less than target, the left pointer is forced to move up the array to a bigger value 
            {
                leftPointer++;
                continue;
            }
                rightPointer--;         //when result is greater than target, the right pointer is forced to down the array to a smaller value    
            
        
        return new int[]{leftPointer+1,rightPointer+1};
        
    }
}
