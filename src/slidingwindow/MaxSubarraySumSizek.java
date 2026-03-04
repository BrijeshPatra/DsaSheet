package slidingwindow;

public class MaxSubarraySumSizek {
    public int maxSubArraySum(int[]arr,int k){
        int windowSum=0;

        int n=arr.length;

        //traverse upto k which means the sliding window will reach till end
        for (int i=0;i<k;i++){
            //update the window sum: add it to every element traversed
            windowSum+=arr[i];
        }
        //store the windowSum in maxAns
        int max_ans=windowSum;

        //run another loop starts from j=k to j= size of arr
        for (int j=k;j<n;j++){

            //add the next element to window sum
            windowSum+=arr[j];

            //subtract the prev element from the window sum
            windowSum-=arr[j-k];

            //then update the max_ans
            max_ans=Math.max(max_ans,windowSum);
        }
        return max_ans;
    }
}
