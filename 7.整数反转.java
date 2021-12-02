/*
 * @lc app=leetcode.cn id=7 lang=java
 *
 * [7] 整数反转
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        long num = 0;
        while (x != 0) {
            num = num * 10 + x % 10;
            x = x / 10;
        }
        return (int) num == num ? (int) num : 0;
    }
}
// @lc code=end

