package day12;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 581. 最短无序连续子数组    https://leetcode-cn.com/problems/shortest-unsorted-continuous-subarray/
 * 给你一个整数数组 nums ，你需要找出一个 连续子数组 ，如果对这个子数组进行升序排序，那么整个数组都会变为升序排序。
 * 请你找出符合题意的 最短 子数组，并输出它的长度。
 * 示例 1：
 * 输入：nums = [2,6,4,8,10,9,15]
 * 输出：5
 * 解释：你只需要对 [6, 4, 8, 10, 9] 进行升序排序，那么整个表都会变为升序排序。
 * 示例 2：
 * 输入：nums = [1,2,3,4]
 * 输出：0
 * 示例 3：
 * 输入：nums = [1]
 * 输出：0
 */
class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] arr = Arrays.copyOf(nums, nums.length);
        Arrays.sort(arr);
        int start = 0;
        for (int i = 0; i < nums.length; i++) {
            if (arr[i] != nums[i]) {
                start = i;
                break;
            }
        }
        int end = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (arr[i] != nums[i]) {
                end = i;
                break;
            }
        }
        if (end==start){
            return 0;
        }
        return end-start+1;
    }
}

public class 最短无序连续子数组 {
}
