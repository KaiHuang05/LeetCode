class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int sum=0;
        if (temp<0) return false;
        while (temp !=0){
            int rem = temp%10;
            temp = temp/10;
            sum = sum*10 + rem;
        }
        if (sum == x){
            return true;
        }
        return false;
    }
}