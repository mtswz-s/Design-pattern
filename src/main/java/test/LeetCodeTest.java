package test;

/**
 * @Author 麦田守望者
 * @Date 2020/8/30 18:32
 * @Version 1.0
 */
public class LeetCodeTest {
    public static void main(String[] args) {
        int[] its = {3, 2, 4};
        int[] ints = twoSum(its, 6);
        for (int i : ints) {
            System.out.println(i);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    int[] re = {i, j};
                    return re;
                }
            }
        }
        return null;
    }
}
