class Solution {
    public int lengthOfLastWord(String s) {
        int word_length = 0;
        s=s.trim();
        for (int i=s.length()-1; i>=0; i--){
            char ch = s.charAt(i);
            if (s.charAt(i) != ' '){
                word_length++;
            }
            else{break;}
        }

        return word_length;
    }
}