class Solution {
    public int minimumBuckets(String hamsters) {
        char [] arr = hamsters.toCharArray();
        int buckets = 0;

        for (int i=0; i<hamsters.length(); i++){
            if (arr[i] == 'H'){
                if (i > 0 && arr[i-1] == 'B'){
                    continue;
                }
                if (i<hamsters.length()-1 && arr[i+1] == '.'){
                    arr[i+1] = 'B';
                    buckets++;
                    continue;
                }
                else if (i > 0 && arr[i-1] == '.'){
                    arr[i-1] = 'B';
                    buckets++;
                    continue;
                }
                else{
                    return -1;
                }
                
            }
        }

        return buckets;
        
    }
}