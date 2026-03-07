package twopointers;

public class TrappingRainWater {
    public int trap(int[]height){
        int left=0;
        int n=height.length;

        int right=n-1;
        int water=0;
        int leftMax=height[left],rightMax=height[right];

       if(left<right){
           if (leftMax<rightMax){
               left++;
               leftMax=Math.max(leftMax,height[left]);
               water+=leftMax-height[left];
           }
           else {
               right--;
               rightMax=Math.max(rightMax,height[right]);
               water-=rightMax-height[right];
           }
       }
       return water;
    }
}
