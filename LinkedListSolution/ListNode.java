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
}


