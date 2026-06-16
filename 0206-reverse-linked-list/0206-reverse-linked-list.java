/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;

        List<Integer> list = new ArrayList <>();

        ListNode current = head;
        while (current != null){
            list.add(current.val);
            current = current.next;
        }

        Collections.reverse(list);
        ListNode result = new ListNode (list.get(0));
        ListNode tail = result;
    
        for (int i=1; i<list.size(); i++){
            tail.next = new ListNode (list.get(i));
            tail = tail.next;
        }

        return result;
        
    }
}