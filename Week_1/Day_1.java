//Two Sum
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i] + nums[j]==target){
                    return new int[]{i,j};
                }
            }

        }
        return new int[]{};
    }
}        


// Best time to Buy and Sell Stock

class Solution {
    public int maxProfit(int[] prices) {
        int buyPrices = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0 ; i < prices.length; i++){
            if(buyPrices < prices[i]){
                int profit = prices[i] - buyPrices;
                maxProfit = Math.max(maxProfit , profit);
            }else{
                buyPrices = prices[i];
            }
        }
        return maxProfit;
        
    }
}

// Remove Duplicates from Sorted Array

class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        
        for(int j = 1; j < nums.length ; j++){
            if(nums[i]!=nums[j]){
                nums[i+1]=nums[j];
                i++;


            }
        }
        return i+1;
    }
}




















