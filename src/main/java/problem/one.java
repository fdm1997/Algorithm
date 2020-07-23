package problem;

/**
 * @Author fdm
 * @Date 2020/7/23 18:12
 * @description：
 *
 *  * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 *  * 输出：7 -> 0 -> 8
 *  * 原因：342 + 465 = 807
 *  *
 */
public class one {

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(9);
        listNode1.next = null;

        ListNode listNode4 = new ListNode(1);
        ListNode listNode5 = new ListNode(9);
        ListNode listNode6 = new ListNode(9);
        ListNode listNode7 = new ListNode(9);
        ListNode listNode8 = new ListNode(9);
        ListNode listNode9 = new ListNode(9);
        ListNode listNode10 = new ListNode(9);
        listNode4.next =listNode5;
        listNode5.next = listNode6;
        listNode6.next = listNode7;
        listNode7.next = listNode8;
        listNode8.next = listNode9;
        listNode9.next = listNode10;

        ListNode set = one.listNode(listNode1,listNode4);
        String v ="";
        while (set != null){
            if (set.next != null){
                v += set.val+ "->";
            }else {
                v += set.val;
            }

            set = set.next;
        }
        System.out.println(v);
    }

    public static ListNode listNode(ListNode l1,ListNode l2){
        ListNode root = new ListNode(0);
        ListNode cursor = root;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0) {
            int sumVal = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
            carry = sumVal / 10;
            ListNode sumNode = new ListNode(sumVal % 10);
            cursor.next = sumNode;
            cursor = sumNode;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        return root.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

    @Override
    public String toString() {
        String v = val+"";
        ListNode listNode = this.next;
        while (listNode != null){
            v += "->"+listNode.val;
            listNode = this.next;
        }
        return v;
    }
}