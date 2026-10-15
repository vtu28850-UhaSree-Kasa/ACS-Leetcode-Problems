/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
     ListNode s,f,e;
     s=f=head;
    while(f!=null&&f.next!=null)
    {
    s=s.next;
    f=f.next.next;
    if(f==s)
    {
        e=head;
        while(s!=e){
            s=s.next;
            e=e.next;
        }
        return e;

    }
    }
    return null;
    }
}