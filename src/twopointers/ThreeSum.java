package twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>>threeSum(int[]nums){
        List<List<Integer>>result=new ArrayList<>();

        int n=nums.length;

        Arrays.sort(nums);

        //n-2: because j and k pointer will be ahead
        for (int i=0;i<n-2;i++){
            if (i>0 && nums[i]==nums[i-1])continue;

            int l=i+1,r=n-1;

            while (l<r){
                int sum=nums[i]+nums[l]+nums[r];

                if (sum==0){
                    result.add(Arrays.asList(nums[i],nums[l],nums[r]));
                } else if (sum>0) {
                    r--;
                }else {
                    l++;
                }
            }
        }
        return result;
    }
}
