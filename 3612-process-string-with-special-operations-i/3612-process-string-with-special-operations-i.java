class Solution {
    public String processStr(String s) {
        StringBuilder sb = new StringBuilder ();

        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (Character.isAlphabetic(ch)) sb.append(ch);
            else if (ch == '#') {
                StringBuilder copy = new StringBuilder (sb);
                sb.append(copy);
            }
            else if (ch == '%') sb.reverse();
            if (!sb.isEmpty() && ch == '*')sb.deleteCharAt(sb.length() -1);
        }
        return sb.toString();
        
    }
}