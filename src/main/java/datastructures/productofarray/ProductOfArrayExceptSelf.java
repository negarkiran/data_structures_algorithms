package datastructures.productofarray;

//Product of Array Except Self
public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int left = 1, right = 1;
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = left;
            left *= nums[i];
        }

        for (int j = nums.length - 1; j >= 0; j--) {
            result[j] *= right;
            right *= nums[j];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        productExceptSelf(nums);
    }
}
