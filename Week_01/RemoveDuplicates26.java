public class RemoveDuplicates26 {
    public static int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i=0; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }

        return j + 1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2};
        int j = removeDuplicates(nums);
        for (int i=0; i < j; i++) {
            System.out.println(nums[i]);
        }
    }
}
