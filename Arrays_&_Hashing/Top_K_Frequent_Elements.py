class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        
        count={}
        
        frequency=[[] for n in range(len(nums)+1)]
        
        output=[]
        
        for i in nums:
            count[i]=count.get(i,0)+1
            
        for i,c in count.items():
            frequency[c].append(i)
            
        for i in range(len(frequency)-1,0,-1):
            
            for x in frequency[i]:
                
                output.append(x)
                
                if len(output)==k:
                    return output
