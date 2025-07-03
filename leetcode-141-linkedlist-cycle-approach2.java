public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> hs = new HashSet<>();
        ListNode temp = head;
        while(temp != null){
            if(hs.contains(temp)){
                return true;
            }
            hs.add(temp);
            temp = temp.next;
        }
        return false;
    }
}
