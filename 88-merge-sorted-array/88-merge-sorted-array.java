class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int size = m + n - 1;
        int i = m - 1;
        int j = n - 1;
        while (size >= 0) {
            if (j >= 0 && i >= 0) {
                if (nums1[i] > nums2[j]) {
                    nums1[size] = nums1[i];
                    size--;
                    i--;
                } else {
                    nums1[size] = nums2[j];
                    size--;
                    j--;
                }
            } else if (i >= 0) {
                nums1[size] = nums1[i];
                size--;
                i--;
            } else {
                nums1[size] = nums2[j];
                size--;
                j--;
            }
        }
    }
}
