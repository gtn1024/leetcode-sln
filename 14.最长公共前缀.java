
/*
 * @lc app=leetcode.cn id=14 lang=java
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length <= 0) {
            return "";
        } else if (strs.length == 1) {
            return strs[0];
        }
        int flag = strs[0].length();
        int i = 0;
        while (true) {
            if (i >= strs.length) {
                break;
            }
            if (strs[i].equals(""))
                return "";

            if (!strs[i].startsWith(strs[0].substring(0, flag))) {
                if (flag <= 0)
                    break;
                flag--;
            } else {
                i++;
            }
        }
        if (flag > 0) {
            return strs[0].substring(0, flag);
        }
        return "";
    }
}
// @lc code=end

