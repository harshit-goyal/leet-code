class Solution {

    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        String a = String.valueOf(x);
        StringBuilder s = new StringBuilder();
        s.append(a);
        s = s.reverse();
        return a.equals(s.toString());
    }
}
