class Solution {
    public void rotate(int[] nums, int k) {
        if (k==0) return;
      if (nums == null || nums.length == 0) return;
        
      int count = 0;
      for (int i=0; i<nums.length && count < nums.length; i++) {
      
      int currentIndex = i;
      int newIndex = (currentIndex + k) % nums.length;
      
      int currentTemp = nums[currentIndex];
      int nextTemp;
      
      while (newIndex != i) {
         nextTemp = nums[newIndex];
         nums[newIndex] = currentTemp;
         currentIndex = newIndex;
         
         newIndex = (currentIndex + k) % nums.length;
         currentTemp = nextTemp;
         
         //how many replacements has been done
         count ++;
      }
      //assign value from where we started
      nums[newIndex] = currentTemp;
      count ++;
    }}
}