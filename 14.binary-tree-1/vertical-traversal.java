/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Pair<U,V>{
    U first;
    V second;
    public Pair(U first, V second){
        this.first=first;
        this.second=second;
    }
    public U getfirst(){
        return first;
    }
    public V getsecond(){
        return second;
    }
}
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Queue<Pair<TreeNode,Integer>> queue=new LinkedList<>();
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        queue.add(new Pair<>(root,0));
        while(queue.size()!=0){
            HashMap<Integer,List<Integer>> tm=new HashMap<>();
            int n=queue.size();
            for(int i=0;i<n;i++){
                Pair ptr=queue.poll();
                TreeNode temp=(TreeNode)ptr.getfirst();
                int hd=(Integer)ptr.getsecond();
                List<Integer> arr;
                if(tm.containsKey(hd)){
                    arr=tm.get(hd);
                    arr.add(temp.val);
                    Collections.sort(arr);
                    tm.put(hd,arr);
                }
                else{
                    arr=new ArrayList<>();
                    arr.add(temp.val);
                    tm.put(hd,arr);
                }
                if(temp.left!=null) queue.add(new Pair<>(temp.left,hd-1));
                if(temp.right!=null) queue.add(new Pair<>(temp.right,hd+1));
            }
            for(Map.Entry<Integer,List<Integer>> i:tm.entrySet()){
                if(map.containsKey(i.getKey())){
                    List<Integer> temp=map.get(i.getKey());
                    for(int j:i.getValue()){
                        temp.add(j);
                    }
                    map.put(i.getKey(),temp);
                }
                else{
                    map.put(i.getKey(),i.getValue());
                }
            }
            
        }
        List<List<Integer>> ans=new ArrayList<>();
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(Map.Entry<Integer,List<Integer>> i:map.entrySet()){
            min=Math.min(min,i.getKey());
            max=Math.max(max,i.getKey());
        }
        for(;min<=max;min++){
            ans.add(map.get(min));
        }
        return ans;
    }
}
