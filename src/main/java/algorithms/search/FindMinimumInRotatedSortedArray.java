package algorithms.search;

public class FindMinimumInRotatedSortedArray {
    public static int findMin(int[] nums) {
        int length = nums.length;
        if (length == 1) return nums[0];
        if (length == 2) return Math.min(nums[0], nums[1]);

        int left = 0, right = length - 1, mid;

        while (left < right) {
            mid = (left + right) / 2;

            if (nums[mid] < nums[right]) {
                right = mid - 1;
            } else if (nums[mid] > nums[right]) {
                left = mid + 1;
            }

            if(right - mid == 1) return Math.min(nums[mid], nums[right]);
            if(mid - left == 1) return Math.min(nums[mid], nums[left]);
        }
        return 0;
    }

    public static int findMinV1(int[] nums) {
        int left = 0, right = nums.length - 1, mid;
        int res = nums[0];

        while (left <= right) {
            if (nums[left] < nums[right]){
                res = Math.min(res, nums[left]);
                break;
            }

            mid = (left + right) / 2;
            res = Math.min(res, nums[left]);

            if (nums[mid] >= nums[left]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {11,13,15,17};
        System.out.println(findMinV1(nums));
    }
}
