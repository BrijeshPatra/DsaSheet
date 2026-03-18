package prefixsum;

import java.util.HashMap;

public class SubarraySumEqualsK {
    public int subArraySum(int[]nums,int k){
        //create a map for frequency count
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);

        //initialise count
        int count=0;

        //initialise prefixSum: it will hold an updated value
        int prefixSum=0;

        //traverse whole array
        for (int n:nums){
            //add each element to prefixSum
            prefixSum+=n;

            //check if map contains the window element
            if (map.containsKey(prefixSum-k)){
                //if yes the increment the count
                count+=map.get(prefixSum-k);
            }
            //if no then update the prefix sum value
            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        }
        return count;
    }
}
