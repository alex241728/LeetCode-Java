package maximum_subarray_53;

class Solution {
  public int maxSubArray(int[] nums) {
    int largestSum = nums[0];
    int[] largests = new int[nums.length];
    largests[0] = nums[0];
    for (int i = 1; i < nums.length; i++) {
      largests[i] = Math.max(largests[i - 1] + nums[i], nums[i]);
      if (largests[i] > largestSum) {
        largestSum = largests[i];
      }
    }
    return largestSum;
  }
}
