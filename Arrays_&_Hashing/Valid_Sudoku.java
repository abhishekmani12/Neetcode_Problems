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

//FAST SOLUTION: (with no hardcoding)

class Solution {
    
    private boolean hasDuplicate(char[][] board, int startRow, int endRow, int startCol, int endCol) 
    {
        boolean[] isPresent = new boolean[10];
        
        for (int i = startRow; i < endRow; i++) 
        {
            for (int j = startCol; j < endCol; j++) 
            {
                if (board[i][j] == '.') continue;
                
                if(isPresent[board[i][j] - '0']) return true;
                
                isPresent[board[i][j] - '0'] = true;
            }
        }
        
        return false;
    }
    
    
    
    public boolean isValidSudoku(char[][] board) 
    {
        // check row
        for (int i = 0; i < board.length; i++)
        {
            
            if(hasDuplicate(board, i, i + 1, 0, board.length)) return false;
        }
        
        
        // check col
        for (int j = 0; j < board.length; j++) 
        {
            
            if(hasDuplicate(board, 0, board.length, j, j + 1)) return false;
        }
        
        // check small square region
        
        int regionSize = (int)Math.sqrt(board.length);
        
        for (int i = 0; i < regionSize; i++) 
        {
            for (int j = 0; j < regionSize; j++) 
            {
                
                if(hasDuplicate(board, i * regionSize, (i + 1) * regionSize, j * regionSize, (j + 1) * regionSize)) return false;
            }
        }
        
        return true;
    }
    
    
}

