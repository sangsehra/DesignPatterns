package org.example;

import java.util.ArrayList;
import java.util.List;

public class CountGreaterThanNDivideByThree {
    public static void main(String[] args) {
        int nums[]= {3,5,2,3,3,2,4,3,2,3,2,2};
        System.out.println(getListOfIntegerCountGreaterThanLength(nums));
    }

    // Moor's ranking victor algo at max 2 result are possible
    static List<Integer> getListOfIntegerCountGreaterThanLength(int[] arr){
        int ct1=0,ct2=0,val1=Integer.MIN_VALUE,val2=Integer.MIN_VALUE;

        List<Integer> res =  new ArrayList<>();
        for (int i=0;i<arr.length;i++) {
            if (ct1 == 0 && arr[i] != val2) {
                val1 = arr[i];
                ct1++;
            } else if (ct2 == 0 && arr[i] != val1) {
                val2 = arr[i];
                ct2++;
            } else if (val1 == arr[i]) {
                ct1++;
            } else if (val2 == arr[i]) {
                ct2++;
            } else {
                ct1--;
                ct2--;
            }

        }
        ct1=0;ct2=0;
        for (int i=0;i<arr.length;i++){
            if(val1==arr[i]){
               ct1++;
            }
            if (val2==arr[i]){
               ct2++;
            }
        }
        if (ct1> arr.length/3){
            res.add(val1);
        }
        if (ct2>arr.length/3){
            res.add(val2);
        }
        return res;
    }
}
