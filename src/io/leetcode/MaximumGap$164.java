package io.leetcode;

/**
 * Created by lvlvforever on 2019/1/23.
 */
public class MaximumGap$164 {
    public static void main(String[] args) {

    }

    public int maximumGap(int[] nums) {
        if (nums == null || nums.length <= 1) return;
        int n = nums.length;
        //暂存中间排序结果
        int[] tmp = new int[n];
        //计数排序中的count数组
        int[] count = new int[radix];
        int divide = 1;
        for (int i = 0; i < digits; i++) {
            for (int j = 0; j < n; j++) {
                tmp[j] = nums[j];
            }
            for (int j = 0; j < radix; j++) {
                count[j] = 0;
            }
            for (int j = 0; j < n; j++) {
                int t = (tmp[j] / divide) % radix;
                count[t]++;
            }
            for (int j = 1; j < radix; j++) {
                count[j] = count[j] + count[j - 1];
            }
            for (int j = n - 1; j >= 0; j--) {
                int t = (nums[j] / divide) % radix;
                tmp[--count[t]] = nums[j];
            }
            divide = divide * radix;
        }
    }
}
