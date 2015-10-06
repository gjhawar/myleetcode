package palindromelinkedlist;

/**
 * Created by gjhawar on 10/6/15.
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        boolean flag = true;
        if(head.next==null || head == null)
            return flag;


        //Move slow pointer one node and fast pointer 2 nodes for each pass
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //Once you reach the mid, make its next element as head of the 2nd list and reverse that list.
        ListNode secondhead = slow.next;
        slow.next = null;

        //Reverse the 2nd half of list
        ListNode p1 = secondhead;
        ListNode p2 = secondhead.next;
        p1.next = null;
        while(p1!=null && p2!=null){
            ListNode temp = p2.next;
            p2.next = p1;
            p1=p2;
            p2=temp;
        }

        //TRAVERSAL CHECK : Just for simplicity renaming p1 to secondhead which is technically the last element in the original list
        //and now has become first element of the reversed list.
        secondhead = p1;
        while(head!=null && secondhead!=null){
            System.out.println(head.val + " "+ secondhead.val);
            if(head.val!=secondhead.val)
            {
                flag = false;
                break;
            }
            else {
                head = head.next;
                secondhead=secondhead.next;
            }
        }

        //ODD : If we have reached the end of the second list and their still the mid element remaining in first list - it is a palindrome
        if(head!=null && secondhead==null)
            flag = true;
        //EVEN : If we have reached the end of both lists and flag wasn`t false in the TRAVERSAL CHECK before
        else if(head==null && secondhead==null)
            flag = true;

        return flag;

    }

    public static void main(String args[]){

        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(1);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        Solution s = new Solution();
        System.out.println(s.isPalindrome(n1));
    }
}
