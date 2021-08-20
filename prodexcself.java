package leetcode.leetcode;

import java.util.Arrays;

public class prodexcself {
    public static void main(String[] args) {
        int[] nums = {-1,1,0,-3,3};
        int output[] = new int[ nums.length];

        output[0] = 1;

        // left prefix product
        for(int i=1;i<nums.length;i++){
            output[i] = output[i-1] * nums[i-1];
        }

        int product = 1;

        for(int i=nums.length-1;i>=0;i--){

            output[i] = output[i] * product;

            product*= nums[i];
        }
        System.out.println(Arrays.toString(output));
    }
}
