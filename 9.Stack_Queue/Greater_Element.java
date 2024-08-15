class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hash=new HashMap<>();
        Stack<Integer> stack=new Stack<>();
        int m=nums2.length;
        int n=nums1.length;
        for(int i=m-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<=nums2[i])
                stack.pop();
                
            if(stack.isEmpty())
                hash.put(nums2[i],-1);
            else
                hash.put(nums2[i],stack.peek());
            stack.push(nums2[i]);
        }    
        for(int i=0;i<n;i++)
            nums1[i]=hash.get(nums1[i]);
        return nums1;
    }
}