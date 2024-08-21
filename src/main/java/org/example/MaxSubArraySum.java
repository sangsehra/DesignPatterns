package org.example;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSum(nums));
    }


    // sliding window
//    static int maxSum(int[] nums) {
//        int sum= Integer.MIN_VALUE;
//        for(int i=1;i<=nums.length;i++){
//            for(int j=0;j<nums.length;j++){
//                int temp=0;
//                int k=j;
//                while(k<=i+j && k<nums.length){
//                    temp+=nums[k];
//                    k++;
//                }
//                if(temp>sum){
//                    sum=temp;
//                }
//            }
//        }
//        return sum;
//    }

    //optimised
//    static int maxSum(int[] nums){
//        int max = Integer.MIN_VALUE;
//        int sum;
//        for(int i=0;i<nums.length;i++){
//            sum=0;
//            for(int j=i;j<nums.length;j++){
//                sum+=nums[j];
//                max= Math.max(sum,max);
//            }
//        }
//        return max;
//    }

    //Kadan's algo
    static int maxSum(int[] nums){
        int max = Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if (sum>max){
                max=sum;
            }
            if (sum<0){
                sum=0;
            }
        }
        return max;
    }

}
