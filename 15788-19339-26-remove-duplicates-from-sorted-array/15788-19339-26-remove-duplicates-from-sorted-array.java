class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int unique = 1; // the first num will always be unique
        for (int i=1; i<nums.length; i++){
            if (nums[i] != nums[i-1]){
                nums[unique] = nums[i];
                unique++;
            }
        }
        return unique;
    }
}