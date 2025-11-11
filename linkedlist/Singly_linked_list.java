package linkedlist;

import java.lang.classfile.components.ClassPrinter.ListNode;

protected class Singly_linked_list {
    private Node head;
     private Node tail;
    private int size;

    public Singly_linked_list() {
        this.size = 0;
    }
    public void removeDuplicates(){
        Node node = head;
        while(node.next!=null){
            if(node.value==node.next.value){
                node.next=node.next.next;
                size--;
            }
            else{
                node=node.next;            }
        }
        tail=node;
        tail.next=null;
    }
public void reorderList(ListNode head) {
        if(head==null||head.next==null){
            return;
        }
        ListNode mid = middleNode(head);
        ListNode hs = reverse(mid);
        ListNode hf = head;
        while(hf!=null&&hs!=null){
            ListNode tail = hf.next;
            hf.next = hs;
            hf =tail;
            tail = hs.next;
            hs.next = hf;
            hs = tail;
        }
        if(hf!=null){
            hf.next = null;
        }
    }
    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);

    }
    // private void reverse(Node node){
    //     if(node ==tail){
    //         head =tail;
    //         return;
    //     }
    //     reverse(node.next);
    //     tail.next=node;
    //     tail = node;
    //     tail.next = null;
    // }

    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = insertRec(val, index - 1, node.next);// with the help of this we return previous node
        return node;//connecting previous node  
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;

            }
            node = node.next;
        }
        return null;
    }
     public static Singly_linked_list merge(Singly_linked_list first, Singly_linked_list second){

        Node f = first.head;
        Node s = second.head;
        Singly_linked_list ans = new Singly_linked_list();
        while(f!=null&&s!=null){
            if(f.value<s.value){
                ans.insertLast(f.value);
                f= f.next;
            }
            else{   
                ans.insertLast(s.value);
                s = s.next;
            }
        


        }
        while(f!=null){
            ans.insertLast(f.value);
            f= f.next;
        }
        while(s!=null){
            ans.insertLast(s.value);
            s= s.next;
        } 
        return ans;
    }

    public int deletionFirst() {
        int val = head.value;
        head = head.next;

        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            return deletionFirst();
        }
        if (index == size - 1) {
            return deletionlast();
        }
        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;

    }

    public int deletionlast() {
        if (size <= 1) {
            return deletionFirst();
        }
        Node secondlast = get(size - 2);
        int val = tail.value;
        tail = secondlast;
        tail.next = null;
        return val;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void insert(int value, int index) {
        if (index == 0) {
            insertFirst(value);
            return;
        }
        if (index == size) {
            insertLast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;

    }

    public void insertLast(int value) {
        if (tail == null) {
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }
    public void reverse(){
        Node prev =null;
        Node present = head;
        Node next = present.next;
        if(size<2){
            return;
        }
        while(present!=null){
            present.next=prev;
            prev = present;
            present=next;
            if(next!=null){
                next = next.next;
            }
        }
        head = prev;
    
    }
    public Node middleNode(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next!=null&&fast.next.next!=null){
slow = slow.next;
fast = fast.next.next;
        }
        return slow;
    }
 public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode headsecond = reverse(mid);
        ListNode rereverse = headsecond;
        while(head!=null&&headsecond!=null){
            if(head.value!=headsecond.value){
                break;
            }head = head.next;
            headsecond = headsecond.next;
        }
        reverse(rereverse);
        return head==null||headsecond==null;
    }
    public static void main(String[] args) {
        Singly_linked_list ll = new Singly_linked_list();
        
        ll.insertFirst(1);
        ll.insertFirst(1);
        ll.insertFirst(2);
        ll.insertFirst(2);
    
ll.display();


ll.reverse();
ll.display();


    }

}
