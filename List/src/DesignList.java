/**
 * @author isADuckA
 * @Date 2023/3/28 9:23
 */
public class DesignList {
    class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){
            this.val=val;
        }
    }


    class MyLinkedList {
        //设置长度
        int length;
        ListNode head;
        public MyLinkedList() {
            length=0;
            head=new ListNode(0);


        }

        public int get(int index) {
            //如果index无效，返回-1
            if(length<=index||index<0){
                return -1;
            }
            ListNode temp=head;
            //找到改结点的位置
            for(int i=0;i<=index;i++){
                temp=temp.next;
            }
            return temp.val;
        }

        public void addAtHead(int val) {
            addAtIndex(0,val);
        }

        public void addAtTail(int val) {
            addAtIndex(length,val);
        }

        public void addAtIndex(int index, int val) {
            ListNode add=new ListNode(val);
            ListNode temp=head;
            if(index>length){
                return ;
            }

            for(int i=0;i<index;i++){
                temp=temp.next;
            }
            add.next=temp.next;
            temp.next=add;
            length++;
        }

        public void deleteAtIndex(int index) {
            if(index<0||index>=length){
                return;
            }
            ListNode temp=head;
            for(int i=0;i<index;i++){
                temp=temp.next;
            }
            if(temp.next.next!=null){
                temp.next=temp.next.next;
            }else{
                temp.next=null;
            }
            length--;

        }
    }
}
