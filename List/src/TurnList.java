/**
 * @author isADuckA
 * @Date 2023/3/28 9:13
 * 实现翻转链表
 */

public class TurnList {
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }

        ListNode pre=null;
        ListNode cur=head;
        ListNode next=null;
        //把当前节点指向前节点，这样的话就自动断开了，所以要保存当前节点的下一个节点
        while(cur!=null){
            next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;

        }
        return pre;

    }
}

/**
 * 定义链表
 */
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}