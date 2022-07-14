class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        
        //target is destination position
        
        if(position.length == 1) //if there's only one car
                return 1;
        
        Stack<Double> stack= new Stack<>();
        
        //creating arr pair for position and target
        
        int[][] pair=new int[position.length][2]; 
        
        for(int i=0;i<position.length;i++)
        {
            pair[i][0]=position[i];
            pair[i][1]=speed[i];
        }
        
        Arrays.sort(pair, java.util.Comparator.comparingInt(o->o[0])); //Sorting pair arr on the basis of position element of the pair
        
        for(int j=pair.length-1;j>=0;j--) //going from right to left(furthest position will always be at the right as it is sorted)
        {
            double timeTaken=(double)(target-pair[j][0])/pair[j][1]; //calculating time taken for car(j) to reach destination from distance divided by velocity
                
            if(!stack.isEmpty() && timeTaken<=stack.peek()) //if next car's time is less than the current car's time, car will join(collide) the existing fleet and so stack doesn't need to updated
            {
                continue;
            }
            else
            {
                stack.push(timeTaken); // if time taken is greater then car will not join(collide) the existing fleet and will be considered as a separate fleet, stack is updated
            }
        }
        
        return stack.size();
        
    }
}
