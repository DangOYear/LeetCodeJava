package com.saltedfish.algorithms;

/**
 *
 * 790. 多米诺和托米诺平铺
 * 有两种形状的瓷砖：一种是 2x1 的多米诺形，另一种是形如 "L" 的托米诺形。两种形状都可以旋转。
 *
 * XX  <- 多米诺
 *
 * XX  <- "L" 托米诺
 * X
 * 给定 N 的值，有多少种方法可以平铺 2 x N 的面板？返回值 mod 10^9 + 7。
 *
 * （平铺指的是每个正方形都必须有瓷砖覆盖。两个平铺不同，当且仅当面板上有四个方向上的相邻单元中的两个，使得恰好有一个平铺有一个瓷砖占据两个正方形。）
 *
 * 示例:
 * 输入: 3
 * 输出: 5
 * 解释:
 * 下面列出了五种不同的方法，不同字母代表不同瓷砖：
 * XYZ XXZ XYY XXY XYY
 * XYZ YYZ XZZ XYY XXY
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/domino-and-tromino-tiling
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode0790 {
    class Solution {
        public int numTilings(int N) {
            return -1;
        }
    }
}
