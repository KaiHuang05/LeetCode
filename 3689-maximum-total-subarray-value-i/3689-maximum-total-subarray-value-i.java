class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;

        for (int i=0; i<nums.length; i++){
            max = Math.max((long) nums[i], max);
            min = Math.min((long) nums[i], min);
        }
        return ((max - min) * k);
    }
}