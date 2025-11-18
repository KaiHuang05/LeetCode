class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        boolean is2 = false;
        if (bits.length == 1) return true;

        for (int i=0; i<bits.length; i++){
            if (bits[i] == 1){
                i++;
                is2 = true;
            }
            else{
                is2 = false;
            }
        }
        return (!is2);
    }
}