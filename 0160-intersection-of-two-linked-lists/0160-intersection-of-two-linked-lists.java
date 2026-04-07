/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a=headA;
        ListNode b=headB;
        boolean f=false;
        boolean f1=false;
        while(!(a==null && b==null)){
            
            if(a==b){
                
                return a;
                
            }
            else if(f==false && a==null){
                a=headB;
                f=true;
                
               
            }
            else if(f1==false && b==null){
                b=headA;
                f1=true;
               
            }
            else{
                a=a.next;
                b=b.next;
            }
        }
        return null;

    }
}