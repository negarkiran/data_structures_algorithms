package algorithms.search

class SearchInRotatedSortedArray {
    fun search(nums: IntArray, target: Int): Int {
        var left = 0; var right = nums.size - 1
        var mid: Int

        while (left <= right) {
            mid = (left + right) / 2

            if (nums[mid] == target) return mid;

            //Left sorted array
            if (nums[left] <= nums[mid]) {
                if (target > nums[mid] || target < nums[left]) {
                    left = mid + 1
                } else {
                    right = mid - 1
                }
            } else {
                if (target < nums[mid] || target > nums[right]) {
                    right = mid - 1
                } else {
                    left = mid + 1
                }
            }
        }
        return -1;
    }
}

fun main(args: Array<String>) {
    var nums = intArrayOf(5, 1, 2, 3, 4);
    var obj = SearchInRotatedSortedArray()
    println(obj.search(nums, 3))
}