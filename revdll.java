class Solution {
    public Node reverse(Node head) {
        Node temp=head;
        Node prev=null;
        while(temp!=null){
            Node n=temp.next;
            temp.next=temp.prev;
            temp.prev=n;
            prev=temp;
            temp=n;
        }
        return prev;
    }
}
