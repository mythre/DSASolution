package LinkedListSolution;

import java.util.List;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    ListNode rotateRight(ListNode head,int k){
        ListNode fastPointer;
        ListNode slowPointer;
        int temp =k;
        int count=0;

        if(head==null|| head.next==null) return head;

        fastPointer=head;
        slowPointer=head;

        while(temp>0 && fastPointer!=null){
            fastPointer=fastPointer.next;
            temp--;
            count++;
        }

        if (fastPointer==null&&temp>=0){

            k = k%(count);
            temp=k;
            fastPointer=head;
            slowPointer=head;
            while(temp>0 && fastPointer!=null){
                fastPointer=fastPointer.next;
                temp--;
            }

        }

        //is rotation needed
        if (k>0){

            while(fastPointer.next!=null){
                slowPointer = slowPointer.next;
                fastPointer = fastPointer.next;
            }
            fastPointer.next=head;
            head=slowPointer.next;
            slowPointer.next=null;
        }

        return head;

    }

     ListNode removeNthFromEnd(ListNode head, int n){
         ListNode fastPointer;
         ListNode slowPointer;
         ListNode prevNode = null;
         int temp =n;
         fastPointer=head;
         slowPointer=head;
         //move fast pointer by n
         while(temp>0){
             fastPointer=fastPointer.next;
             temp--;
         }
         //while fastpointer reaches n,slow reaches length of thelist-n(nth node from the list)

         while(fastPointer!=null){
             prevNode=slowPointer;
             slowPointer = slowPointer.next;
             fastPointer = fastPointer.next;
         }

         //slowpointer is the node to be removed
         //if head is to be removed
         if (slowPointer==head)
         {
             head=slowPointer.next;
             return head;
         }

         prevNode.next=slowPointer.next;
         return head;



     }


}


