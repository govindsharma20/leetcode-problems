class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> mr = new ArrayList<Integer>();

        ListNode current1 = list1;
        while (current1 != null) {
            mr.add(current1.val);
            current1 = current1.next;
        }

        ListNode current2 = list2;
        while (current2 != null) {
            mr.add(current2.val);
            current2 = current2.next;
        }

        int n = mr.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (mr.get(j) > mr.get(j + 1)) {
                    int temp = mr.get(j);
                    mr.set(j, mr.get(j + 1));
                    mr.set(j + 1, temp);
                }
            }
        }

        if (mr.isEmpty()) {
            return null;
        }

        ListNode dummyHead = new ListNode();
        ListNode currentMerged = dummyHead;

        for (int val : mr) {
            currentMerged.next = new ListNode(val);
            currentMerged = currentMerged.next;
        }

        return dummyHead.next;
    }
}
