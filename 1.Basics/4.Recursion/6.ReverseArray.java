public class Solution {
    static int i=0;
    public static int[] reverseArray(int n, int []nums) {
        if(n>i){
            int temp=nums[i];
            nums[i]=nums[n-1];
            nums[n-1]=temp;
            i++;
            reverseArray(--n,nums);
        }
        return nums;
    }
}