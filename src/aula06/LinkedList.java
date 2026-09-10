package aula06;

public class LinkedList {
    Node head;

    private static class Node {
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
        }
    }

    public void insertFirst(String data) {
        var newNode = new Node(data);
        newNode.next = this.head;
        this.head = newNode;
    }

    public void insertEnd(String data) {
        var newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        var currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public void print() {
        var currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }
}
