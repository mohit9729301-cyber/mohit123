
class Solution {

    public int[] sortArray(int[] nums) {
        return sort(nums);
    }

    public int[] sort(int[] a) {

        if (a.length <= 1) return a;

        int mid = a.length / 2;

        int[] left = sort(java.util.Arrays.copyOfRange(a, 0, mid));
        int[] right = sort(java.util.Arrays.copyOfRange(a, mid, a.length));

        return merge(left, right);
    }

    public int[] merge(int[] left, int[] right) {

        int[] result = new int[left.length + right.length];

        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {

            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while (i < left.length) {
            result[k++] = left[i++];
        }

        while (j < right.length) {
            result[k++] = right[j++];
        }

        return result;
    }
}
