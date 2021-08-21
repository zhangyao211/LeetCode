import java.util.HashSet;

/**
 * 找出数组中重复的数字。
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 *
 *示例 1：
 * 输入：
 * [2, 3, 1, 0, 2, 5, 3]
 * 输出：2 或 3
 *
 *
 * 方法一：哈希表 / Set
 * 利用数据结构特点，容易想到使用哈希表（Set）记录数组的各个数字，当查找到重复数字则直接返回。
 *
 * 算法流程：
 * 初始化： 新建 HashSet ，记为 dic ；
 * 遍历数组 nums 中的每个数字 num ：
 * 当 num 在 dic 中，说明重复，直接返回 num ；
 * 将 num 添加至 dic 中；
 * 返回 -1−1 。本题中一定有重复数字，因此这里返回多少都可以。
 *
 * 复杂度分析：
 * 时间复杂度 O(N) ： 遍历数组使用 O(N) ，HashSet 添加与查找元素皆为 O(1)。
 * 空间复杂度 O(N) ： HashSet 占用 O(N)大小的额外空间。
 *
 * 作者：jyd
 * 链接：https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/solution/mian-shi-ti-03-shu-zu-zhong-zhong-fu-de-shu-zi-yua/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */



public class Solution {
    public int findRepeateNumber(int[] nums){
        HashSet<Integer> dic = new HashSet<>();
        for (int num : nums) {
            if (dic.contains(num)) {
                return num;
            }
            dic.add(num);
        }
        return -1;
    }

}
