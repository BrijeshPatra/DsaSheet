package twopointers;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {

            //calculate width
            int width = right - left;

            //calculate the area between left and right
            int currArea = Math.min(height[left], height[right]) * width;

            //find the maximum area b/w left and right
            maxArea = Math.max(maxArea, currArea);

            //move the small pointer or update it
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
