class Solution {
    public int minimumDeletions(String s) {
    int deletions = 0;
    int bCount = 0;

    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (c == 'b') {
            bCount++; 
        } else {
            if (bCount > 0) {
                deletions++;
                bCount--; 
            }
        }
    }
    return deletions;
    }

    private boolean haveA (String str){
        for (int i=0; i< str.length(); i++){
            if (str.charAt(i) == 'a'){
                return true;
            }
        }
        return false;
    }
}