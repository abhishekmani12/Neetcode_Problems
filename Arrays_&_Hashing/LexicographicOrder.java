public class Main {

    public static void main(String[] args) {
        String input="cba";

        char[] cinput=input.toCharArray();

        int length=3;

        ArrayList<Character> S1=new ArrayList<Character>();
        ArrayList<Character> S2=new ArrayList<Character>();
        ArrayList<Character> S3=new ArrayList<Character>();

        for(char c: cinput)
        {
            S1.add(c);
        }

        //Step 1:
        int c=0;
        while(S1.size()!=0)
        {
            S2.add(S1.get(c));
            S1.remove(c);
            if(S1.size()==0) break;
        }

        //Step 2:
        Collections.reverse(S2);
        int c1=0;

        while(S2.size()!=0)
        {
            S3.add(S2.get(c));
            S2.remove(c);
            if(S2.size()==0) break;
        }

        Collections.sort(S3);

        for(int test=0;test<S3.size();test++)
        {
          System.out.print(S3.get(test));
        }
        
    }
}
