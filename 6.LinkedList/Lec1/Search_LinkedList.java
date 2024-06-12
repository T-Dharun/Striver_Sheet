class Solution {
    static boolean searchKey(int n, Node head, int key) {
        Node ptr=head;
        while(ptr!=null){
            if(ptr.data==key) return true;
            ptr=ptr.next;
        }
        return false;
    }
}