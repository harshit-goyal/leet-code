class Solution {
    public int missingNumber(int[] nums) {
        int length=nums.length;
        int sum=(length+1)*(length)/2;
        int i=0;
        while(i<length){
            sum-=nums[i];
            i++;
        }
        return sum;
    }
}