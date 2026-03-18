package slidingwindow;

public class MinSizeSubarraySum {
    public int minSizeSubArrLen(int target,int[]nums){
        int minLength=Integer.MAX_VALUE;

        int sum=0;

        int left=0;

        for (int right=0;right<nums.length;right++){
            sum+=nums[right];

            while (sum>=target){
//                sum-=nums[left];
//                left++;
//                sum+=nums[right];
                //right-left+1: current length

                minLength=Math.min(minLength,right-left+1);
                sum-=nums[left];
                left++;
            }
        }
        //if min length = IntMax: if it is true then print 0 else min len
        return minLength==Integer.MAX_VALUE?0:minLength;
    }
}
