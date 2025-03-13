package maximum_subarray_53;

class Driver {
  public static void main(String[] args) {
    Solution s = new Solution();

    /*
      Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
      Output: 6
      Explanation: The subarray [4,-1,2,1] has the largest sum 6.
    */
    System.out.println(s.maxSubArray(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}));

    /*
      Input: nums = [1]
      Output: 1
      Explanation: The subarray [1] has the largest sum 1.
    */
    System.out.println(s.maxSubArray(new int[] {1}));

    /*
      Input: nums = [5,4,-1,7,8]
      Output: 23
      Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
    */
    System.out.println(s.maxSubArray(new int[] {5, 4, -1, 7, 8}));
  }
}
