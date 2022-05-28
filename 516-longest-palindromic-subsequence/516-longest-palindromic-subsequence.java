class Solution {
    public int longestPalindromeSubseq(String text1) {
        StringBuilder input1 = new StringBuilder();
 
        // append a string into StringBuilder input1
        input1.append(text1);
 
        // reverse StringBuilder input1
        input1.reverse();
        String text2=input1.toString();
        int[][] longest = new int[text1.length()+1][text2.length()+1];
        for(int i = 0; i <= text1.length(); i ++)
            Arrays.fill(longest[i], 0);
        
        for(int i = 1; i <= text1.length(); i ++)
            for(int j = 1; j <= text2.length(); j ++) {
                if(text1.charAt(i-1) == text2.charAt(j-1))
                    longest[i][j] = longest[i-1][j-1] + 1;
                else
                    longest[i][j] = Math.max(longest[i-1][j], longest[i][j-1]);
            }
        return longest[text1.length()][text2.length()];
    }
}