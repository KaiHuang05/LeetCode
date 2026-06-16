class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList <>();
        Arrays.sort (nums);

        for (int i=0; i<nums.length; i++){
            // Skip duplicate first number
            if (i>0 && nums[i] == nums[i-1]){
                continue;
            }

            int left = i+1;
            int right = nums.length-1;

            while (left < right){
                if (nums[i]+nums[left]+nums[right] == 0){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    // Skip duplicated left number
                    while (left < right && nums[left] == nums[left-1]){
                        left++;
                    }
                    // Skip duplicated right number
                    while (left < right && nums[right] == nums[right+1]){
                        right--;
                    }
                }
                else if (nums[i]+nums[left]+nums[right] < 0){
                    left++;
                }else{
                    right--;
                }
            }
        }

        return result;
    }
}