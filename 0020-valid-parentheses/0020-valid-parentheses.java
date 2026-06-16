class Solution {
    public boolean isValid(String s) {
        Stack <Character> stack = new Stack <>();

        for (char ch: s.toCharArray()){
            if (ch == '{' || ch == '(' || ch == '['){
                stack.push(ch);
            }else{
                // important
                if (stack.isEmpty()) return false;

                char current = stack.pop();
                if ((current == '{' && ch != '}') ||
                    (current == '(' && ch != ')') ||
                    (current == '[' && ch != ']')){
                        return false;
                    }
            }
        }
        return stack.isEmpty();
    }
}