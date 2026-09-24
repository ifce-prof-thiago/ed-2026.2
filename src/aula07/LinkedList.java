package aula07;

public class LinkedList<T> {
    Node head;
    private class Node {
        T data;
        Node next;
        public Node(T data) {
            this.data = data;
        }
    }

    public void insertFirst(T data) {
        var newNode = new Node(data);
        newNode.next = this.head;
        this.head = newNode;
    }

    public void insertEnd(T data) {
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

    public void removeFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    public boolean contains(T data) {
        if (head == null) {
            return false;
        }
        var temp = head;
        while (temp != null) {
            if (temp.data.equals(data)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public T get(T data) {
        if (head == null) {
            return null;
        }
        var temp = head;
        while (temp != null) {
            if (temp.data.equals(data)) {
                return temp.data;
            }
            temp = temp.next;
        }
        return null;
    }

    public void removeEnd() {
        if (head == null) return;

        if (head.next == null) {
            head = null;
            return;
        }

        var previous = head;
        var currentNode = head.next;

        while (currentNode.next != null) {
            previous = currentNode;
            currentNode = currentNode.next;
        }

        previous.next = null;
    }

    public void print() {
        var temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
