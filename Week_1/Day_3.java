// Moves Zeroes
class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for(int num:nums){
            if(num!=0){
                nums[index++] = num;
            }
        }
        while(index< nums.length){
            nums[index++] = 0;
        }
    }
}

// Squares of a Sorted Array

class Solution {
    public int[] sortedSquares(int[] nums) {
       int n = nums.length;
       int[] result = new int[n];
       int left = 0;
       int right = n-1;
       int index = n-1;
       while(left <= right){
        int leftSquare = nums[left]*nums[left];
        int rightSquare = nums[right]*nums[right];
        if(leftSquare > rightSquare){
            result[index--] = leftSquare;
            left++;
        }else{
            result[index--] = rightSquare;
            right--;
        }
       } 
       return result;
    }
}

//Container with Most Water

class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxArea = 0;

        while(left < right){
            int width = right- left;
            int h = Math.min(height[left], height[right]);

            maxArea = Math.max(maxArea , width*h);
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
}
