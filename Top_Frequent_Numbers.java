public class TopKFrequentNumbers {
    public static List<Integer> findTopKFrequentNumbers(int[] nums, int k) {
        if (k == nums.length) {
            return new ArrayList<>();
        }
        
        Map<Integer, Integer> numFrequencyMap = new HashMap<>();

        for (int n: nums) {
            numFrequencyMap.put(n, numFrequencyMap.getOrDefault(n, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>((e1, e2) -> e1.getValue() -
                e2.getValue());

       

        for(Map.Entry<Integer, Integer> entry : numFrequencyMap.entrySet()) {
            minHeap.add(entry);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

       
        List<Integer> topNumbers = new ArrayList<>(k);
        while (!minHeap.isEmpty()) {
            topNumbers.add(minHeap.poll().getKey());
        }
        return topNumbers;
    }

    public static void main(String[] args) {
       

        List<Integer> result = TopKFrequentNumbers.findTopKFrequentNumbers(new int[] {1,1,1,2,2 }, 2);
        System.out.println("Here are the K frequent numbers: " + result);
    }
}
