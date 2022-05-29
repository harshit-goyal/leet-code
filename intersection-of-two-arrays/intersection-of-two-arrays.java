class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> intersection = new ArrayList<>();
        
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        
        for (int i = 0; i < nums2.length; i++) {
            if (set.remove(nums2[i])) {
                intersection.add(nums2[i]);
            }
        }
        
        int[] result = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            result[i] = intersection.get(i);
        }
        
        return result;
    }
}