/**
 * @author isADuckA
 * @Date 2023/3/30 10:59
 */
public class ListCrossing {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //利用set集合的特性
        // Set<ListNode> set=new HashSet<ListNode>();
        // while(headA!=null){
        //     set.add(headA);
        //     headA=headA.next;
        // }
        // while(headB!=null){
        //     if(!(set.add(headB))){
        //         return headB;
        //     }
        //     headB=headB.next;
        // }
        // return null;


        //双指针
        ListNode p1=headA;
        ListNode p2=headB;
        //a链表+b链表前部分=b链表+a链表前部分，因为所走的结点数相同，所以到相交
        //结点的时候会相遇，也就是p1==p2
        while(p1!=p2){
            if(p1==null){
                p1=headB;
            }else{
                p1=p1.next;
            }
            if(p2==null){
                p2=headA;
            }else{
                p2=p2.next;
            }
        }

        return p1;

    }
}
