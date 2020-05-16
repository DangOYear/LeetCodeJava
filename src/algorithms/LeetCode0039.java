package src.algorithms;

public class LeetCode0039 {

    class Solution {
        public int majorityElement(int[] nums) {
            int count = 1;
            int major = nums[0];

            for (int i = 1; i < nums.length; ++i) {
                if (nums[i] == major) {
                    ++count;
                }else {
                    --count;
                }
                if (count == 0) {
                    count = 1;
                    major = nums[i];
                }
            }
            return major;
        }
    }

}
