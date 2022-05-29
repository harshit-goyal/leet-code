class Solution {
    public int lengthOfLastWord(String s) {
        String array[] = s.split(" ");
        int length = array.length;
        if(length==0) return 0;
        return array[length-1].length();
    }
}