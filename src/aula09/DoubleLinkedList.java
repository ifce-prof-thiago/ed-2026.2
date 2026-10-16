package aula09;

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

    // 1. precorrer todos os elementos do início até o final, imprimindo os dados

    // 2. precorrer a lista de forma inversa, imprimindo todos os dados

}
