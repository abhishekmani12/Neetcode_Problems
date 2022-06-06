class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> output=new ArrayList<>();
        
        HashMap<String, List<String>> mapper=new HashMap();
        
        if(strs.length==0)
            return output;
        
        for(String s : strs)
        {
            char[] count=new char[26];
            
            for(char c: s.toCharArray())
            {
                count[c-'a']++;     //Mapping the alphabets in the range(0-25) and counting the occurrence of each alphabet in each string
            }
            
            String cStr= new String(count);
            
            if(mapper.get(cStr)==null)
            {
                mapper.put(cStr, new ArrayList<>());           
                
            }
            
            mapper.get(cStr).add(s);      //Mapping the 'count' to 'strs(s)'
            
        }
        
        output.addAll(mapper.values());
        
        
        
        return output;
            
        
    }
}
