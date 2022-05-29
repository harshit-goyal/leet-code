class Solution {
    public int maxSubArray(int[] nums) {
        int maxSoFar = Integer.MIN_VALUE; 
        int maxTillNow = 0;
        int i=0;
        while(i<nums.length){
            maxTillNow = maxTillNow+nums[i];
            if(maxSoFar<maxTillNow){
                maxSoFar=maxTillNow;
            }
            if(maxTillNow<0) maxTillNow=0;
            i++;
        }
        return maxSoFar;
    }
}