class Solution {
    public int removeElement(int[] nums, int val) {
        int repeated = 0;
        for (int i=0; i<nums.length; i++){
            if (nums[i] != val){
                nums[repeated] = nums[i];
                repeated++;
            }
        }
        return repeated;
    }
}