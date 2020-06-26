
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MoveZeroes283 {

    /**
     * 双指针
     * @param nums
     */
    public static void moveZeroes(int[] nums) {
        int flag = 0;
        for (int i=0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int a = nums[flag];
                nums[flag] = nums[i];
                nums[i] = a;
                flag++;
            }
        }
    }

    /**
     * 两次遍历
     * 先把非零元素往前移，最后补0
     * @param nums
     */
    public static void moveZeroes2(int[] nums) {
        int j = 0;
        for (int i=0; i < nums.length; i++) {
            // 非0元素往前移
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        // 补0
        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 0, 0, 3};
//        int[] nums = new int[] {};
//        moveZeroes(nums);
        moveZeroes2(nums);
        for (int i: nums) {
            System.out.println(i);
        }
    }
}
