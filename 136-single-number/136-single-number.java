class Solution {

    public int singleNumber(int[] nums) {
        int result = nums[0];
        int i = 1;
        while (i < nums.length) {
            result = result ^ nums[i];
            i++;
        }
        return result;
    }
}
