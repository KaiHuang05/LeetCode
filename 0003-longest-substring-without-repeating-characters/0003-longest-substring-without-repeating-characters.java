class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLength = 0;
        Map <Character, Integer> map = new HashMap <>();

        for (int i=0; i<s.length(); i++){
            char current = s.charAt(i);

            if (map.containsKey(current) && map.get(current) >= left){
                left = map.get(current) + 1;
            }

            map.put (current, i);

            int currentLength = i - left + 1; // +1 because the looping starts from 0;

            maxLength = Math.max (maxLength, currentLength);
        }

        return maxLength;
    }
}