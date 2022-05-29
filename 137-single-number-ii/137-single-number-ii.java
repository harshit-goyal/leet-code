class Solution {

    public int singleNumber(int[] nums) {
        int a, b, tempa;
        a = b = tempa = 0;

        for (int c : nums) {
            tempa = (a & ~c) | (b & c);
            b = (~a) & (b ^ c);
            a = tempa;
        }
        return b;
    }
}
