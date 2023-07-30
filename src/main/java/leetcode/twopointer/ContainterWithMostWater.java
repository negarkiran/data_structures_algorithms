package leetcode.twopointer;

//https://leetcode.com/problems/container-with-most-water/
public class ContainterWithMostWater {
    public int maxArea(int[] height) {
        if (height.length <= 1) return 0;
        int left = 0, right = height.length - 1;
        int maxArea = 0;
        int currentArea = 0;
        while (left < right) {
            currentArea = (right - left) * Math.min(height[left], height[right]);
            maxArea = Math.max(currentArea, maxArea);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
