//SLOW SOLUTION:

class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        //HashSet for row, column and 3X3 squares(Total: 9)
        
        HashSet<String> hset=new HashSet<String>();
        
        //Iterating through rows and columns
        
        for(int r=0;r<9;r++)
        {
            for(int c=0;c<9;c++)
            {
                if(board[r][c] !='.') // (i) Checking if there is an empty element(which is denoted as ' . ')
                {
                    
                   if(hset.contains("Row"+r+board[r][c]) || hset.contains("Column"+c+board[r][c])) // (ii) Checking for duplicates in Row and Column
                   {
                       return false;
                   }
                    //Updating Row and Column
                    
                    hset.add("Row"+r+board[r][c]);
                    hset.add("Column"+c+board[r][c]);
                    
                    
                    if(hset.contains("squares"+(r/3)*3+c/3+board[r][c]))// (iii) Checking for duplicates in each of the 3X3 squares---key: [r/3][c/3]
                    {
                        return false;
                    }
                    //updating square
                    
                    hset.add("squares"+(r/3)*3+c/3+board[r][c]);
                }
            }
        }
        
        return true;
    }
}
