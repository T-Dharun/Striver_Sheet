
class Solution
{
    public ArrayList <Integer> bottomView(Node root)
    {
        if(root==null) return new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        Queue<Node> queue=new LinkedList<>();
        root.hd=0;
        queue.add(root);
        while(queue.size()!=0){
            Node temp=queue.poll();
            int hd=temp.hd;
            map.put(hd,temp.data);
            if(temp.left!=null){
                queue.add(temp.left);
                temp.left.hd=hd-1;
                
            }
            if(temp.right!=null){
                queue.add(temp.right);
                temp.right.hd=hd+1;
            }
        }
        int min=Integer.MAX_VALUE,max=0;
        for(Map.Entry<Integer,Integer> i:map.entrySet()){
            min=Math.min(min,i.getKey());
            max=Math.max(max,i.getKey());
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(;min<=max;min++) list.add(map.get(min));
        return list;
        
    }
}
