/**
 * @author isADuckA
 * @Date 2023/3/28 9:20
 * 移除链表元素
 *
 */
public class RemoveElement {
    public ListNode removeElements(ListNode head, int val) {
        //判断头节点是都需要往下移
        while(head!=null&&head.val==val){
            head=head.next;
        }
        if(head==null){
            return head;
        }
        ListNode first=head;
        while(first.next!=null){
            if(first.next.val==val){
                first.next=first.next.next;
            }else{
                first=first.next;
            }
        }
        return head;

    }
}
