package Interfaces_in_java;

import java.util.*;

public class reverseLinkedList {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    public void printList() {
        if(head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    // delete first
    public void deleteFirst() {
        if(head == null) {
            System.out.println("list is empty");
            return;
        }
        head = head.next;
    }

    public void reverseIterate() {
    if(head == null || head.next == null) {
        return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            
            // update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public Node reverseRecursive(Node head) {
        if(head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    public static void main(String[] args) {
        reverseLinkedList list = new reverseLinkedList();
        // list.addLast(1);
        // list.addLast(2);
        // list.addLast(3);
        list.addLast(4);
        list.printList();

        list.head = list.reverseRecursive(list.head);
        list.printList();
        
    }
}
