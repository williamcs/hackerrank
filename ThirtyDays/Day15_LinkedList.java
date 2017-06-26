package hackerrank.ThirtyDays;

import java.util.Scanner;

/**
 * Created by will on 6/23/17.
 */
class Node {
    int data;
    Node next;
    Node(int d){
        this.data = d;
        next = null;
    }
}

public class Day15_LinkedList {
    public static Node insert(Node head, int data) {
        // Complete this method
        Node start = head;
        if (start == null) {
            head = new Node(data);
            return head;
        }

        while(start.next != null) {
            start = start.next;
        }
        start.next = new Node(data);

        return head;
    }

    public static Node insert1(Node head, int data) {
        if (head == null) {
            head = new Node(data);
            return head;
        }

        Node dummy = new Node(-1);
        dummy.next = head;

        while(head.next != null) {
            head = head.next;
        }
        head.next = new Node(data);

        return dummy.next;
    }

    public static Node insertRecursive(Node head, int data) {
        if (head == null) return new Node(data);
        head.next = insertRecursive(head.next, data);
        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert1(head, ele);
        }
        display(head);
        sc.close();
    }
}
