class Solution {
    public int search(int[] nums, int target) {
        return bst(nums,0,nums.length-1,target);
    }
    int bst(int nums[], int left, int right,int target){
        if(nums==null || nums.length==0) return -1;
        if(left<=right){
        int mid = left + (right-left)/2;
        if(nums[mid]==target) return mid;
        if(target>nums[mid]){
            return bst(nums,mid+1,right,target);
        }else{
            return bst(nums,left,mid-1,target);
        }
        }
        return -1;
    }
}