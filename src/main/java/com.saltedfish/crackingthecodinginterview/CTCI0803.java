package com.saltedfish.crackingthecodinginterview;

/**
 * @author SaltedFish
 * @date 2021/6/3
 */
public class CTCI0803 {
    class Solution {
        public int maximum(int a, int b) {
            long c = a;
            long d = b;

            int res = (int) ((Math.abs(c-d) + c + d) / 2);
            return res;
        }
    }
}
