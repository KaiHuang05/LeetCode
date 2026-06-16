class Solution {
    public int maxArea(int[] height) {
        int currentMax = Integer.MIN_VALUE;
        int frontpointer = 0;
        int backpointer = height.length - 1;

        while (frontpointer < backpointer){
            int h = Math.min (height[frontpointer], height[backpointer]);
            int width = backpointer - frontpointer;
            currentMax = Math.max(currentMax, h*width);

            if (height[frontpointer] < height[backpointer]){
                frontpointer++;
            }else{
                backpointer--;
            }
        }

        return currentMax;
    }
}