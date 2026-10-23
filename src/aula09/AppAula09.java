import aula09.DoubleLinkedList;

void main() {
    var list = new DoubleLinkedList<Integer>();
    list.insertFirst(10);
    list.insertFirst(20);
    list.insertLast(1988);

    list.removeFirst();
    list.print();
    list.removeLast();
    list.print();
}
