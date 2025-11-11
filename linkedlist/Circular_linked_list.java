package linkedlist;

public class Circular_linked_list {
    private Node head;
    private Node tail;

    public Circular_linked_list() {
        this.head = null;
        this.tail = null;
    }

    public void insert_last(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }
    public void delete(int val){
        Node node = head;
        if(node ==null){
    return;
        }
        if(node.value == val){
            head = head.next;
            tail.next = head;
        }
        do{
            Node n = node.next;
            if(n.value==val){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while(node!=head);
    }
public void display(){
    Node node = head;
    if(head!=null){
        do{
            System.out.print(node.value+"->");
            node = node.next;
        }
        while(node!=head);
    }
    System.out.println("END");
}
    private class Node {
        int value;
        Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(int value) {
            this.value = value;
        }

        public Node(Node next) {
            this.next = next;
        }

    }
}
