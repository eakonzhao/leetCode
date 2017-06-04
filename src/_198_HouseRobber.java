/**
 * Created by Eakon on 2017/6/4.
 * https://leetcode.com/problems/house-robber/#/description
 *
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed,
 * the only constraint stopping you from robbing each of them is that adjacent houses have security system connected
 * and it will automatically contact the police if two adjacent houses were broken into on the same night.
 * Given a list of non-negative integers representing the amount of money of each house,
 * determine the maximum amount of money you can rob tonight without alerting the police.
 *
 * testcaste:
 *
 * input:
 *  [3,4,1,2]
 *  [4,3,1,2]
 *
 * output:
 *  6[3,(4),1,(2)]
 *  6[(4,)3,1,(2)]
 *
 *  暴力解法:检查所有房子的组合，对每一个组合，检查是否有相邻的房子，如果没有，记录其价值。找最大值。时间复杂度为 O((2^n)*n)
 */
public class _198_HouseRobber {
    public int rob(int[] nums){
        return 0;
    }
}
