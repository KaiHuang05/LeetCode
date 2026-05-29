class Solution {
    public String longestPalindrome(String s) {
        if (s == null){
            return null;
        }

        String answer = "";

        for (int i=0; i<s.length(); i++){
            String odd = expandAroundCorner (s, i, i);
            String even = expandAroundCorner (s, i, i + 1);

            if (odd.length() > answer.length()){
                answer = odd;
            }

            if (even.length() > answer.length()){
                answer = even;
            }
        }
        
        return answer;
    }

    private String expandAroundCorner (String s, int left, int right){
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left --;
            right ++;
        }

        return s.substring (left + 1, right);
    }
}