/**
 * @author isADuckA
 * @Date 2023/3/29 14:13
 * 两两交换链表中的节点
 *
 */
public class ChangeNode {
    public ListNode swapPairs(ListNode head) {
        //递归终止的条件在于当前节点为null或者是下一个节点为null(没有的交换)
        if(head==null||head.next==null){
            return head;
        }
        //两个节点为一个循环，两个节点中后面的节点才是真正的节点，所以返回的也是这个节点
        ListNode reallyHead=head.next;
        //因为要交换，所以第一个节点要指向第三个节点
        head.next=swapPairs(reallyHead.next);
        //真正返回的节点要指向她前面的节点，即第二个节点指向第一个节点
        reallyHead.next=head;
        return reallyHead;

    }
}
