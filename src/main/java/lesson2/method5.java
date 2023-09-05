package lesson2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class method5 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                nums[i] = 0;
                System.out.print(nums[i]);
            } else {
                nums[i] = 1;
                System.out.print(nums[i]);
            }
        }
      //  System.out.println(Arrays.toString(nums));
    }
}
