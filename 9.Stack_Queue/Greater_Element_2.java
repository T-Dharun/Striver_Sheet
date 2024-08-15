class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length,k;
        int ans[]=new int[n];
        Stack<Integer> stack=new Stack<>();
        for(int i=2*n-1;i>=0;i--){
            if(i<n) k=i;
            else k=i-n;
            while(!stack.isEmpty() && stack.peek()<=nums[k])
                stack.pop();
            if(stack.isEmpty()) ans[k]=-1;
            else ans[k]=stack.peek(); 
            stack.push(nums[k]);
        }
        return ans;
    }
}