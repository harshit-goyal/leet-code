class Solution {

    public int removeDuplicates(int[] arr) {
        int length = arr.length;
        if (length == 0 || length == 1) {
            return length;
        }
        int j = 0;
        int i = 0;
        while (i < length - 1) {
            if (arr[i] != arr[i + 1]) {
                arr[j] = arr[i];
                j++;
            }
            i++;
        }
        arr[j] = arr[length - 1];
        j++;
        return j;
    }
}
