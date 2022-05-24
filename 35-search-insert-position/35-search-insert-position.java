class Solution {

    public int searchInsert(int[] nums, int target) {
        return solution(0, nums.length - 1, target, nums);
    }

    int solution(int l, int r, int target, int[] nums) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                return solution(l, mid - 1, target, nums);
            } else {
                return solution(mid + 1, r, target, nums);
            }
        }
        return l;
    }
}
