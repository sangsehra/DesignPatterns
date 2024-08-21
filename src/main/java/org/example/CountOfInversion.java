package org.example;

public class CountOfInversion {

    public static void main(String[] args) {
        int a[] = {15,28,11,20,14,7,14,2,15,4,22,19,17,1,26,6,20,2,6};
        System.out.println(numberOfInversions(a,a.length));
    }
     public static int numberOfInversions(int []a, int n) {
            // Write your code here.
            int res= countMergeSort(a,0,a.length-1);
            return res;
        }

        public static int countMergeSort(int[] a, int s, int e){
            int cnt=0;
            int mid = (e+s)/2;
            if(s>=e){
                return 0;
            }
            cnt+=countMergeSort(a, s,mid);
            cnt+=countMergeSort(a, mid+1,e);
            cnt+= merge(a,s,mid,e);
            return cnt;
        }

        public static int merge(int[] a, int s, int mid, int e){
            int[] res = new int[e-s+1];
            int left = s;
            int right=mid+1;
            int cnt=0;
            int i=0;
            while(left<=mid && right<=e){
                if(a[left] <= a[right]){
                    res[i]=a[left];
                    i++;
                    left++;
                } else {
                 res[i]=a[right];
                 cnt+=mid-left+1;
                 i++;
                 right++;
                }
            }

            while(left<=mid){
                res[i++]=a[left++];
            }
            while(right<=e){
                res[i++]=a[right++];
            }

            for (int j=s;j<=e;j++){
                a[j]=res[j-s];
            }
            return cnt;
    }
}
