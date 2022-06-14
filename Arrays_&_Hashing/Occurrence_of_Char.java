import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        String input="njfdnhlkzdlkjbbiririf";

        HashMap<Character, Integer> hmap=new HashMap<>();

        char[] charArr=input.toCharArray(); //converting string to char array

        for(char c:charArr)
        {
            if(hmap.containsKey(c))
            {
                hmap.put(c,hmap.get(c)+1);  //increases value of key:c by 1 for each occurrence of c
                
            }
            else
            {
                hmap.put(c,1);   //set value of key:c as 1 for the first occurrence 
            }
        }

        System.out.println(Arrays.asList(hmap)); //printing the hmap as a list
    }
}
