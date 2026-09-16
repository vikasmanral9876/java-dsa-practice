package Interfaces_in_java;

import java.util.*;

public class exercise2 {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add a node at the end of the linked list
    public static Node addNode(Node head, int data) {
        Node newNode = new Node(data);

        if(head == null) {
            return newNode;
        }

        Node temp = head;

        while(temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;

        return head;
    }

    // Delete all nodes having value > 25
    public static Node delGreaterThan25(Node head) {

        // Remove nodes from the beginning
        while(head != null && head.data > 25) {
            head = head.next;
        }

        // If all nodes were deleted
        if(head == null) {
            return null;
        }

        Node prev = head;
        Node curr = head.next;

        while(curr != null) {
            if(curr.data > 25) {
                // Delete current node
                prev.next = curr.next;
            } else {
                // Move prev only if current node is not deleted
                prev = curr;
            }

            curr = curr.next;
        }
        return head;
    }
    
    // Print the linked list
    public static void printList(Node head) {
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        Node head = null;

        System.out.println("Enter " + n + " numbers (1-50):");
        
        for(int i=0; i<n; i++) {
            int value = sc.nextInt();

            // valid input
            if(value < 1 || value > 50) {
                System.out.println("Please enter a number between 1 and 50.");
                i--;
                continue;
            }

            head = addNode(head, value);
        }

        System.out.println("Original Linked List:");
        printList(head);

        head = delGreaterThan25(head);

        System.out.println("After deleting values greater than 25:");
        printList(head);

        sc.close();
    }
}
