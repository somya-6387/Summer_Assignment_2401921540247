//Maximum SubArray

class Solution{
    public int maxSubArray(int[]nums){
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0 ; i< nums.length ; i++){
            int currSum = 0;
            for(int j = i; j<nums.length; j++){
                currSum += nums[j];
                maxSum = Math.max(currSum, maxSum);
            }
        }
        return maxSum;
    }
}

//Contains Duplicate

import java.util.Arrays;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 1; i<nums.length; i++){
            if(nums[i] == nums[i-1]){
                return true;
            }
        }
        return false;
    }
}

// Maximum Average Subarray1

class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int sum = 0;

        for(int i = 0;i<k; i++){
            sum += nums[i];
        }

        int maxSum = sum;

        for(int i = k; i<nums.length; i++){
            sum = sum-nums[i-k]+nums[i];
            maxSum = Math.max(maxSum, sum);
        }
        return (double)maxSum/k;
    }
}
