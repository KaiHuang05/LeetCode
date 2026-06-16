class Solution {
    public int romanToInt(String s) {
        int total = 0;
        Map <Character, Integer> map = new HashMap <>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        boolean special = false;

        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (i<s.length() -1){
                if (ch == 'I' && s.charAt(i+1) == 'V'){
                total += 4;
                i++;
                }
                else if (ch == 'I' && s.charAt(i+1) == 'X'){
                    total += 9;
                    i++;
                }
                else if (ch == 'X' && s.charAt(i+1) == 'L'){
                    total += 40;
                    i++;
                }
                else if (ch == 'X' && s.charAt(i+1) == 'C'){
                    total += 90;
                    i++;
                }
                else if (ch == 'C' && s.charAt(i+1) == 'D'){
                    total += 400;
                    i++;
                }
                else if (ch == 'C' && s.charAt(i+1) == 'M'){
                    total += 900;
                    i++;
                }
                else{
                    total += map.get(ch);
                }
            }else{
                total += map.get(ch);
            }
        }

        
        return total;
    }
}