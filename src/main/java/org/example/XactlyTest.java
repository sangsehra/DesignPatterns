package org.example;

import java.util.Arrays;
import java.util.Stack;

public class XactlyTest {
    public static void main(String[] args) {
        int [] arr = {12,34,24,23,78,37,44};
                 //    1  3  2  1  0  1  0

        System.out.println(Arrays.toString(getGreaterTempDistance(arr)));
        /*
        monotonic stack

        78 44

        12 -->1
        24 --> 1
        26 -->1
        34 --> 1+2
        37 1
         */
     }
     //34 24 26

    /*
     int [] arr = {12,34,24,23,78,37,44};
                    1  3  2  1  0  1  0
     */
     public static int[] getGreaterTempDistance(int[] in){
         int [] out = new int[in.length];
         Stack<Integer> st = new Stack<>();

         for(int i=0;i<in.length;i++){
             if (st.empty()){
                 st.push(i);
             }
             else {
                 while (!st.empty() && in[st.peek()]<in[i]){
                     int ind = st.peek();
                     out[ind]=out[ind+1]+1;
                     st.pop();
                 }
                 st.push(i);
             }
         }
         return out;
     }
}
