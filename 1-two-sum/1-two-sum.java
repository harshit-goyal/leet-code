class Solution {
    public int[] twoSum(int[] nums, int target) {
         int size = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        int i =0;
        while(i<size){
            int element = nums[i];
            int diff = target-element;
            if(map.containsKey(diff)){
                return new int[]{map.get(diff),i};
            }else{
                map.put(element,i);
            }
            
            i++;
        }
        return null;
    }
}