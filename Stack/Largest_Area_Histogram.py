class Solution:
    def largestRectangleArea(self, heights: List[int]) -> int:
        
        max_area=0
        stack=[]  #index, height pair stack
        
        for i, h in enumerate(heights):
            
            start=i
            
            while stack and stack[-1][1]>h: #stack's top value and the top values's height >
                
                index, height=stack.pop()        #if current height is lower than the previous hi=eight in the stack then pop
                
                max_area=max(max_area, height*(i-index)) #calculating area
                start=index
                
            stack.append((start, h))   #if current height is greater than previous height then push
            
        for i, h in stack: #after full pass heights, indices whose area extends till the end is left in the stack pafter popping, the area of these is calculated
            
            max_area=max(max_area, h*(len(heights)-i))
        return max_area
