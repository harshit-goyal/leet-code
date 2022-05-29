class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int i=0;
        while(i<nums.length){
            int temp = nums[i];
            if(map.containsKey(temp) && i-map.get(temp)<=k){
                return true;
            }else{
                map.put(temp,i);
            }
            i++;
        }
        return false;
    }
}