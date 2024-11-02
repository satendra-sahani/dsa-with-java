class Solution {
    public static int lengthOfLongestSubstring(String s) {
         int[] charIndex = new int[128];
        
        for (int i = 0; i < 128; i++) {
            charIndex[i] = -1;
        }

        int maxLength = 0; 
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);
            if (charIndex[currentChar] >= start) {
                start = charIndex[currentChar] + 1;
            }

            charIndex[currentChar] = end;
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
    public static void main(String[] args){
        String input1="abcabcbb";
        int answer1=lengthOfLongestSubstring(input1);
        System.out.println(answer1);

    }
}