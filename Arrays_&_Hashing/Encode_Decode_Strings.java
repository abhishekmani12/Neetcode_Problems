public class Solution {

      /*
     * @param strs: a list of strings
     * @return: encodes a list of strings to a single string.
     */
     
    public String encode(List<String> strs) {

        StringBuilder encoded=new StringBuilder();

        for(String i: strs)
        {
            encoded.append(i.length+"#"+i); ///delimiter is a character which separates the words--"#" is used here to distinguish the number infront and the word behind
        }

        return encoded.toString();

    }

    /*
     * @param str: A string
     * @return: decodes a single string to a list of strings
     */
    public List<String> decode(String str) {
        
        List<String> decoded=new ArrayList<>();

        for(int i=0;i<str.length();i++)
        {
            String length=""; //empty String
            
            while(str.charAt(i)!="#")
            {
                length=length+str.charAt(i); //fetching the first characters(numbers which denote the length of the word) till  delimiter-"#"
                i++;
            }

            int wlength=Integer.parseInt(length);

            i++; //the letter of the word after the "#"

            String word="";

            for(int j=i;j<wlength+i;j++)
            {
                word=word+str.charAt(j);
            }

            decoded.add(word);

            i=i+wordlength-1; //Starting index for thre next word
        }

        return decoded;
    }
}
