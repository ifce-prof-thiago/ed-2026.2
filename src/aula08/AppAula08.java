import aula08.Node;

void main() {
    var a = new Node(50);
    var b = new Node(1988);
    a.next = b;
    b.next = a;
    var current = a;
    while (current != null) {
        System.out.println(current.data);
        current = current.next;
    }
}