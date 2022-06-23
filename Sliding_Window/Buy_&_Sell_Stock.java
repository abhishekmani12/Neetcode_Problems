class Solution {
    public int maxProfit(int[] prices) {
        
        int result=0;
        
        int buy=Integer.MAX_VALUE; //this is to make the first iteration of 'if' condition true (assigns the first price point to buy)
        
        for(int i: prices)
        {
            if(i<buy)
            {
                buy=i;
            }
            else
            {
                result=Math.max(result,i-buy ); //i acts as the sell pointer here
            }
        }
        
        return result;
        
    }
}
