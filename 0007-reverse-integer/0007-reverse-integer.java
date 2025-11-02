class Solution {
    public int reverse(int x) {
        String value = String.valueOf(x);
        StringBuilder sb = new StringBuilder ();

        for (int i=0; i<value.length(); i++){
            sb.append(value.charAt(i));
        }
        sb.reverse();
        String hold = sb.toString();

        if (hold.charAt(hold.length()-1) == '-'){
            hold = hold.replace("-","");
            Long num = Long.parseLong(hold);
            if (overflow(num)){
                return 0;
            }
            return -1*Integer.parseInt(hold);
        }
        else{
            Long num = Long.parseLong(hold);
            if (overflow(num)){
                return 0;
            }
            return Integer.parseInt(hold);
        }
    }

    public boolean overflow (Long num){
        if (num > Integer.MAX_VALUE){
            return true;
        }
        return false;
    }
}