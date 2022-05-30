class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int count[]=new int[26];
        int i=0;
        while(i<s.length()){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
            i++;
        }
        i=0;
        while(i<26){
            if(count[i]!=0) return false;
            i++;
        }
        return true;
    }
}