class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int numTarget = target;
        int [] convertedLetters = convertLetter (letters);
        int maxNum = largest (convertedLetters);

        if (numTarget >= maxNum){
            return letters[0];
        }

        int smallestInt = smallestLarger (convertedLetters, target);

        for (int i=0; i<convertedLetters.length; i++){
            if (convertedLetters[i] == smallestInt){
                return letters[i];
            }
        }
        return letters[0];
    }

    private int [] convertLetter (char [] letters){
        int [] conversion = new int [letters.length];

        for (int i=0; i< letters.length; i++){
            conversion [i] = (int) letters[i];
        }

        return conversion;
    }

    private int largest (int [] series){
        int maxNum = Integer.MIN_VALUE;

        for (int i=0; i<series.length; i++){
            if (series[i] > maxNum){
                maxNum = series[i];
            }
        }

        return maxNum;
    }

    private int smallestLarger (int [] series, int target){
        ArrayList<Integer> smaller = new ArrayList<>();

        for (int i=0; i<series.length; i++){
            if (series [i] > target){
                smaller.add(series[i]);
            }
        }

        return smaller.get(0);
    }
}