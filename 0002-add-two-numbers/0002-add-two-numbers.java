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
import java.math.BigInteger;
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder sbL1 = new StringBuilder ();
        StringBuilder sbL2 = new StringBuilder ();

        while (l1 != null){
            sbL1.append(String.valueOf(l1.val));
            l1 = l1.next;
        }

        while (l2 != null){
            sbL2.append(String.valueOf(l2.val));
            l2 = l2.next;
        }

        BigInteger num1 = new BigInteger(sbL1.reverse().toString());
        BigInteger num2 = new BigInteger(sbL2.reverse().toString());
        BigInteger sum = num1.add(num2);
        StringBuilder sb = new StringBuilder (String.valueOf(sum));
        String sumStr = sb.reverse().toString();

        ListNode node = new ListNode (0);
        ListNode current = node;
        for (int i=0; i<sumStr.length(); i++){
            int digit = Integer.parseInt(String.valueOf(sumStr.charAt(i)));
            current.next = new ListNode(digit);
            current = current.next;
        }
        
        return node.next;
    }
}