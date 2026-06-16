class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        int count = 0;
        int[] merged = Arrays.copyOf(nums1, length);
        double ans;

        for (int i=nums1.length; i<length; i++){
            merged [i] = nums2[count++];
        }

        Arrays.sort(merged);

        if (length % 2 == 1){
            int median = length/2;
            ans = (double)merged[median];
            return ans;
        }
        else{
            int median1 = length/2 -1;
            int median2 = length/2;
            ans = (double)(merged[median1] + merged[median2]);
            return ans/2;
        }
    }
}