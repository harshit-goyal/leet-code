class Solution {
    public String longestPalindrome(String s) {
        int start = 0;
        int maxLength = 1;
        int length = s.length();
        int i = 1;
        int low,high;
        while(i<length){
            low = i-1;
            high = i;
            while(low>=0 && high<length && s.charAt(low)==s.charAt(high)){
                if(high-low+1>maxLength){
                    start=low;
                    maxLength=high-low+1;
                }
                low--;
                high++;
            }
            
            low = i-1;
            high = i+1;
            while(low>=0 && high<length && s.charAt(low)==s.charAt(high)){
                if(high-low+1>maxLength){
                    start=low;
                    maxLength=high-low+1;
                }
                low--;
                high++;
            }
            
            i++;
        }
        return s.substring(start,start+maxLength);
    }
    
}