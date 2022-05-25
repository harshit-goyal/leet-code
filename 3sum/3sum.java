class Solution {

    public List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int target = 0;
        Arrays.sort(arr);

        int low = 0, mid = 0, high = 0, seek = 0;
        for (int i = 0; i < arr.length; ++i) {
            if (i > 0 && arr[i] == arr[i - 1]) continue; // skip it to avoid getting same triplets
            for (int j = i + 1; j < arr.length; ++j) {
                if (j > i + 1 && arr[j] == arr[j - 1]) continue; // skip it to avoid getting same triplets
                seek = target - arr[i] - arr[j];
                if (seek < arr[j]) break; // we break because seek cannot be found ahead if arr[j] is greater than it after sorting.
                low = j + 1;
                high = arr.length - 1;
                while (low <= high) {
                    mid = low + (high - low) / 2;
                    if (arr[mid] == seek) {
                        // add this triplet to results.
                        List<Integer> triplet = new ArrayList<>();
                        triplet.add(arr[i]);
                        triplet.add(arr[j]);
                        triplet.add(seek);
                        res.add(triplet);
                        break;
                    } else if (arr[mid] > seek) {
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                }
            }
        }

        return res;
    }
}
