class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map <Integer, Integer> freq = new HashMap <>();

        // Create frequency map
        for (int num: nums){
            freq.put (num,freq.getOrDefault(num,0)+1); // here need getOrDefault() to handle null case
        }

        // Min heap, lowest priority on top
        PriorityQueue <Integer> heap = new PriorityQueue <>((a,b) -> freq.get(a) - freq.get(b));
        for (int num: freq.keySet()){
            heap.add(num);

            if (heap.size() >k){
                heap.poll(); // remove less frequency items
            }
        }

        int [] result = new int [k];
        for (int i=0; i<k; i++){
            result[i] = heap.poll();
        }

        return result;
    }
}