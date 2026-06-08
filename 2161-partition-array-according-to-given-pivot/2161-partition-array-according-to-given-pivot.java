class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List <Integer> smallerThanPivot = new ArrayList <>();
        List <Integer> largerThanPivot = new ArrayList <>();
        int pivotOccurance = 0;

        for (int i=0; i<nums.length; i++){
            if (nums [i]< pivot){
                smallerThanPivot.add (nums [i]);
            }
            else if (nums [i] == pivot){
                pivotOccurance ++;
            }
            else{
                largerThanPivot.add (nums[i]);
            }
        }

        while (pivotOccurance != 0){
            smallerThanPivot.add (pivot);
            pivotOccurance --;
        }

        for (Integer value: largerThanPivot){
            smallerThanPivot.add (value);
        }

        int [] arr = new int [smallerThanPivot.size()];

        for (int i=0; i< arr.length; i++){
            arr [i] = smallerThanPivot.get (i);
        }

        return arr;
    }
}