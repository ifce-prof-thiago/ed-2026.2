package aula10;

public class DoubleLinkedList<T> {
    private int size;
    private Node first;
    private Node last;

    public DoubleLinkedList() {
        size = 0;
    }

    private class Node {
        Node prev;
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
        }

        public Node(Node prev, T data, Node next) {
            this.prev = prev;
            this.data = data;
            this.next = next;
        }
    }

    public void insertFirst(T data) {
        var newNode = new Node(data);
        if (first == null) {
            last = newNode;
        } else {
            newNode.next = first;
            first.prev = newNode;
        }
        first = newNode;
        size++;
    }

    public void insertLast(T data) {
        var newNode = new Node(data);
        if (last == null) {
            first = newNode;
        } else {
            newNode.prev = last;
            last.next = newNode;
        }
        last = newNode;
        size++;
    }

    public void print() {
        if (size == 0) {
            System.out.println("Lista Vazia");
            return;
        }
        var current = first;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public void printReverse() {
        if (size == 0) {
            System.out.println("Lista Vazia");
            return;
        }
        var current = last;
        while (current != null) {
            System.out.println(current.data);
            current = current.prev;
        }
    }

    public void removeFirst() {
        if (size == 0) {
            return;
        }
        first = first.next;
        if (size == 1) {
            last = null;
        } else {
            first.prev = null;
        }
        size--;
    }

    public void removeLast() {
        if (size == 0) {
            return;
        }
        last = last.prev;
        if (size == 1) {
            first = null;
        } else {
            last.next = null;
        }
        size--;
    }

    public T getFirst() {
        if (size == 0) {
            return null;
        }
        return first.data;
    }

    public T getLast() {
        if (size == 0) {
            return null;
        }
        return last.data;
    }

    public int size() {
        return size;
    }

}
