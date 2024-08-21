package programs;

public class CountOfInversion {
    public static void main(String[] args) {
        int[] nums ={10,6,3,2,1};
        System.out.println(reversePairs(nums));
    }

    public static int reversePairs(int[] nums) {

        int[] temp = new int[nums.length];
        return inversionCount(nums,0,nums.length-1,temp);
    }

    public static int inversionCount(int[] nums,int l,int r,int[] temp){
        if(l>=r){
            return 0;
        }
        int inv=0;
        int mid = l+(r-l)/2;
       // System.out.println(mid);
        inv+=inversionCount(nums,l,mid,temp);
        inv+=inversionCount(nums,mid+1,r,temp);
        inv+= merge(nums,l,mid,r,temp);
        return inv;
    }

    public static int merge(int[] nums,int l,int m, int r,int[] temp){
        int i=l,j=m+1;
        int inv=0;

        while(i<=m && j<=r){
            if ((long)nums[i]>((long)nums[j]*2)){
                inv += m-i+1;
                j++;
            } else{
                i++;
            }
        }

        i=l;j=m+1;
        int k = l;
        while(i<=m && j<=r){
            if (nums[i]<=nums[j]){
                temp[k++]=nums[i++];
            } else {
                temp[k++]=nums[j++];
            }
        }

        while(i<=m){
            temp[k++]=nums[i++];
        }

        while(j<=r){
            temp[k++]=nums[j++];
        }

        for(;l<=r;l++){
            nums[l]=temp[l];
        }

        return inv;
    }
}
