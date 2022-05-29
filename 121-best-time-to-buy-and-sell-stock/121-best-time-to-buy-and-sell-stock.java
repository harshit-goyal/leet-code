class Solution {
    public int maxProfit(int[] prices) {
     int max = 0;
        int min=Integer.MAX_VALUE;
        int i=0;
        while(i<prices.length){
            if(min>prices[i]){
                min=prices[i];
            }
            else{
                max = Math.max(max,prices[i]-min);
            }
            i++;
        }
        return max;
    }
}