
class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        Node right=head,left=head;
        while(right.next!=null)
            right=right.next;
        
        while(left!=right && left!=right.next){
            int a=left.data,b=right.data,sum=a+b;
            if(sum== target){
                ArrayList<Integer> temp=new ArrayList<>();
                temp.add(a);
                temp.add(b);
                list.add(temp);
                right=right.prev;
                left=left.next;
            }
            else if(sum>target) 
                right=right.prev;
            else
                left=left.next;
        }
        return list;
    }
}