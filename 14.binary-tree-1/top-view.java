
class Pair<U, V> {
    U first;
    V second;

    Pair(U first, V second) {
        this.first = first;
        this.second = second;
    }

    U getKey() { return first; }
    V getValue() { return second; }
}

class Solution {
    
    static ArrayList<Integer> topView(Node root) {
        HashMap<Integer,Integer> map=new HashMap<>();
        Queue<Pair<Node,Integer>> queue=new LinkedList<>();
        ArrayList<Integer> list=new ArrayList<>();
        if(root==null) return new ArrayList<>();
        queue.add(new Pair<>(root,0));
        while(queue.size()!=0){
            Pair<Node,Integer> temp=queue.poll();
            Node ptr=temp.getKey();
            int hd=temp.getValue();
            if(!map.containsKey(hd)) map.put(hd,ptr.data);
            if(ptr.left!=null) queue.add(new Pair<>(ptr.left,hd-1));
            if(ptr.right!=null) queue.add(new Pair<>(ptr.right,hd+1));
        }
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> i:map.entrySet()){
            min=Math.min(min,i.getKey());
            max=Math.max(max,i.getKey());
        }
        for(;min<=max;min++) list.add(map.get(min));
        return list;
    }
}
