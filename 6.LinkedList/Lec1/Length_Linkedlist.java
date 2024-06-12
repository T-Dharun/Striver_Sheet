
class Solution
{
    //Function to count nodes of a linked list.
    public static int getCount(Node head)
    {
        Node ptr=head;
        int count=0;
        while(ptr!=null){
            count++;
            ptr=ptr.next;
        }
        return count;
    }
}