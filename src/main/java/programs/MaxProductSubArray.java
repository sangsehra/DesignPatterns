package programs;

public class MaxProductSubArray {
    public static void main(String[] args) {
        double [] nums = {0,10,10,10,10,10,10,10,10,10,-10,10,10,10,10,10,10,10,10,10,0};
        System.out.println(maxProduct(nums));
    }
    public static long maxProduct(double[] nums) {
        double prefix=1,suffix=1;
        double max = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i=0;i<nums.length;i++){
            if(prefix==0) prefix=1;
            if(suffix==0) suffix=1;

            prefix *= nums[i];
            suffix *= nums[n-i-1];

            max=Math.max(max,Math.max(prefix,suffix));
        }
        return (int)max;
    }
}
