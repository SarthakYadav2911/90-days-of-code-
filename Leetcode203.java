import java.util.Scanner;


class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { 
        this.val = val; 
    }
}

public class Leetcode203 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the number of elements in the linked list: ");
        int n = sc.nextInt();

        
        
        System.out.println("Enter the " + n + " elements sequentially:");
        ListNode head = new ListNode(sc.nextInt());
        ListNode tail = head;

        for (int i = 1; i < n; i++) {
            tail.next = new ListNode(sc.nextInt());
            tail = tail.next;
        }

        
        System.out.print("Enter the target value you want to remove: ");
        int targetVal = sc.nextInt();

        // 4. Print the original list to confirm input
        System.out.print("\nOriginal List: ");
        ListNode printNode = head;
        while (printNode != null) {
            System.out.print(printNode.val + " -> ");
            printNode = printNode.next;
        }
        System.out.println("null");

       
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode current = dummy;
        
        while (current.next != null) {
            if (current.next.val == targetVal) {
                current.next = current.next.next; 
            } else {
                current = current.next; 
            }
        }
        
        head = dummy.next; 
        
        System.out.print("After Removing All " + targetVal + "'s: ");
        printNode = head;
        if (printNode == null) {
            System.out.println("null (The list is now empty!)");
        } else {
            while (printNode != null) {
                System.out.print(printNode.val + " -> ");
                printNode = printNode.next;
            }
            System.out.println("null");
        }

        sc.close(); 
    }
}