53. Maximum Subarray
Given an integer array nums, find the subarray with the largest sum, and return its sum.

Example 1:
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
  
Example 2:
Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.

//Naive Approach: 
class Solution {
  //Tc: O(n^2) Sc: O(1)
    public int maxSubArray(int[] nums) {
        int maxim = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length;i++)
        {
            int res = 0;
            for(int j = i ; j < nums.length; j++)
            {

                res += nums[j];
                maxim = Math.max(maxim,res);
            }
        }
        return maxim;
    }
}
