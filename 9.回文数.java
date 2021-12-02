/*
 * @lc app=leetcode.cn id=9 lang=java
 *
 * [9] 回文数
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        char[] chars = Integer.toString(x).toCharArray();
        boolean not = false;
        for (int i = 0; i < (chars.length / 2 + 1); i++) {
            if (chars[i] != chars[chars.length - i - 1]) {
                not = true;
                break;
            }
        }
        return !not;
    }
}
// @lc code=end

