package slidingwindow;

public class SubarrayProdLessK {
    public int numSubArrayProductLessThanK(int[]nums,int k){
        if (k<=1)return 0;

        int left=0;int product=1;
        int count=0;

        int n=nums.length;

        for (int right=0;right<n;right++){
            product*=nums[right];

            while (product>=k){
                product/=nums[left];
                left++;
            }
            count+=right-left+1;
        }
        return count;
    }
}
