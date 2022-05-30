class Solution {

    public int[] ini;
    public Random rand;
    
    public Solution(int[] nums) {
        ini = nums;
        rand = new Random();
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return ini;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        boolean[] visited = new boolean[ini.length];
        int[] nums = new int[ini.length];
        int index = 0;
        while (index < nums.length) {
            int r = rand.nextInt(nums.length);
            if (visited[r] == false) {
                nums[index++] = ini[r];
                visited[r] = true;
            }
        }
        return nums;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */