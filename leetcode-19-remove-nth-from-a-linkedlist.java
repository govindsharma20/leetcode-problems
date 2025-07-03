class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }

        if (count == n) {
            return head.next;
        }
        
        ListNode ptr = head;
        int ans = count - n;
        int pos = 0;
        while(pos < ans - 1){
            ptr = ptr.next;
            pos++;
        }
        
        ptr.next = ptr.next.next;
        return head;
    }
}
