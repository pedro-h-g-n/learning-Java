import java.util.Arrays;
public class SortedList {
    static class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
        }
    }
    public static void main(String[] args) {

        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            }else{
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if (list1 != null){
            current.next = list1;   
        }if (list2 != null) {
            current.next = list2;
            
        }
        ListNode temp = dummy.next;
        while (temp != null) {
            System.out.println(temp+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
