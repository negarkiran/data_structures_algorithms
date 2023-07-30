package algorithms.search

class FindMinimumInRotatedSortedArrayKt {
    fun findMin(nums: IntArray): Int {
        var left = 0
        var right = nums.size - 1
        var mid: Int
        var res = nums[0]

        while (left <= right) {
            if (nums[left] < nums[right]){
                res = Math.min(res, nums[left])
                break
            }

            mid = (left + right) / 2

            res = Math.min(res, nums[mid])

            if (nums[mid] >= nums[left] ) {
                left = mid + 1
            } else {
                right = mid - 1
            }
        }
        return res
    }

}