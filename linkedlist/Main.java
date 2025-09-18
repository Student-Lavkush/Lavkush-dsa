package linkedlist;

public class Main {
    public static void main(String[] args) {
        Customlinkedlist ll = new Customlinkedlist();
        ll.insertFirst(3);
        ll.insertFirst(12);
        ll.insertFirst(24);
        ll.insertFirst(19);
        ll.insertLast(10);
        ll.insert(100,2);
        ll.display();
    }
}
