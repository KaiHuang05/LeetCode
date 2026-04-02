class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;

        int index = 0;
        int sign = 1;
        long result = 0;

        if (s.charAt(index) == '-' || s.charAt(index) == '+') {
            sign = (s.charAt(index) == '-') ? -1 : 1;
            index++;
        }

        while (index < s.length()) {
            char ch = s.charAt(index);
            
            if (!Character.isDigit(ch)) break;

            int digit = ch - '0'; 
            
            result = result * 10 + digit;

            if (sign == 1 && result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign == -1 && -result < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            index++;
        }

        return (int) (result * sign);
    }
}