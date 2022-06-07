class Solution {
    public String licenseKeyFormatting(String S, int K) {
       StringBuilder sb = new StringBuilder(); 
        S = S.replace("-", ""); 
        S = S.toUpperCase();
        if (S.length() == 0) {
            return S; 
        }
        int i = S.length() - 1; 
        while (i >= 0) {
            int count = 0; 
            while (count < K && i >= 0) {
                count++; 
                sb.append(S.charAt(i--)); 
            }
            sb.append("-"); 
        }
        
        sb.deleteCharAt(sb.length() - 1); 
        return sb.reverse().toString(); 
    }
    
}