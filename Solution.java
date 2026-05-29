class ListNode {
    int val;
    ListNode next;
    
    ListNode() {}
    
    ListNode(int val) { 
        this.val = val; 
    }
    
    ListNode(int val, ListNode next) { 
        this.val = val; 
        this.next = next; 
    }
}

public class Solution {
    
   
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode current = head;
        
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next; 
                        } else {
                current = current.next; 
            }
        }
        
        return head;
    }

    
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

  
    public static void main(String[] args) {
            ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        System.out.print("Original List: ");
        printList(head);


        Solution solver = new Solution();
        ListNode result = solver.deleteDuplicates(head);

        System.out.print("After Removing Duplicates: ");
        printList(result);
    }
}
    

