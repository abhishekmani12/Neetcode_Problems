class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int top=0;
        
        int bot=matrix.length-1;
        int mid=0;
        
        //Binary search between rows
        
        while(top<bot)
        {
            mid=(top+bot)/2;
            
            if(target <matrix[mid][0]) //checking mid row's first element
            {
               bot=mid;  //above mid
            }
            
            else if(target> matrix[mid][matrix[0].length-1]) //checking mid row's last element
            {
                top=mid+1;  //below mid
            }
            else 
                break;
        }
        
        //Binary Seearch in the specific row found
        
        if(Arrays.binarySearch(matrix[(top + bot)/2], target) >=0)
        {
            return true;
        }
        else
            return false; //element not found
    }
}
