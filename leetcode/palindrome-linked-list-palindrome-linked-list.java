        while(fast!=null && fast.next!=null){
            slow=slow.next;
        ListNode fast=head;
        if(head==null)return false;
        ListNode slow=head;
    public boolean isPalindrome(ListNode head) {
class Solution {
        if(head.next==null)return true;
            fast=fast.next.next;
        }
        if(slow==null)return false;
        slow=reverse(slow);
        ListNode temp=head;
        while(temp!=null && slow!=null){
            if(temp.val!=slow.val)return false;
            temp=temp.next;
            slow=slow.next;
        }
        return true;
        
    }
    public ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        ListNode next=head;
        while(curr!=null){
            next=next.next;
            curr.next=prev;
            prev=curr;
