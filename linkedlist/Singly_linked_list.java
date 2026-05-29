package linkedlist;

public class Singly_linked_list {

    private Node head;
    private Node tail;
    private int size;

    public Singly_linked_list() {
        this.size = 0;
    }

    // INSERT AT FIRST
    public void insertFirst(int value) {

        Node node = new Node(value);

        node.next = head;

        head = node;

        if (tail == null) {
            tail = head;
        }

        size++;
    }

    // INSERT AT LAST
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

    // INSERT AT INDEX
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

    // INSERT USING RECURSION
    public void insertRec(int val, int index) {

        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node) {

        if (index == 0) {

            Node temp = new Node(val, node);

            size++;

            return temp;
        }

        node.next = insertRec(val, index - 1, node.next);

        return node;
    }

    // DELETE FIRST
    public int deletionFirst() {

        int val = head.value;

        head = head.next;

        if (head == null) {
            tail = null;
        }

        size--;

        return val;
    }

    // DELETE LAST
    public int deletionlast() {

        if (size <= 1) {
            return deletionFirst();
        }

        Node secondlast = get(size - 2);

        int val = tail.value;

        tail = secondlast;

        tail.next = null;

        size--;

        return val;
    }

    // DELETE AT INDEX
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

        size--;

        return val;
    }

    // GET NODE
    public Node get(int index) {

        Node node = head;

        for (int i = 0; i < index; i++) {
            node = node.next;
        }

        return node;
    }

    // FIND NODE
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

    // DISPLAY
    public void display() {

        Node temp = head;

        while (temp != null) {

            System.out.print(temp.value + " -> ");

            temp = temp.next;
        }

        System.out.println("END");
    }

    // REMOVE DUPLICATES
    public void removeDuplicates() {

        Node node = head;

        while (node != null && node.next != null) {

            if (node.value == node.next.value) {

                node.next = node.next.next;

                size--;
            } else {

                node = node.next;
            }
        }

        tail = node;
    }

    // REVERSE COMPLETE LIST
    public void reverse() {

        Node prev = null;

        Node present = head;

        tail = head;

        while (present != null) {

            Node next = present.next;

            present.next = prev;

            prev = present;

            present = next;
        }

        head = prev;
    }

    // REVERSE FROM GIVEN NODE
    private Node reverse(Node node) {

        Node prev = null;

        Node present = node;

        while (present != null) {

            Node next = present.next;

            present.next = prev;

            prev = present;

            present = next;
        }

        return prev;
    }

    // MIDDLE NODE
    public Node middleNode(Node head) {

        Node slow = head;

        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;

            fast = fast.next.next;
        }

        return slow;
    }

    // CHECK PALINDROME
    public boolean isPalindrome(Node head) {

        if (head == null) {
            return true;
        }

        Node mid = middleNode(head);

        Node headSecond = reverse(mid);

        Node rereverse = headSecond;

        while (head != null && headSecond != null) {

            if (head.value != headSecond.value) {

                reverse(rereverse);

                return false;
            }

            head = head.next;

            headSecond = headSecond.next;
        }

        reverse(rereverse);

        return true;
    }

    // REORDER LIST
    public void reorderList(Node head) {

        if (head == null || head.next == null) {
            return;
        }

        Node mid = middleNode(head);

        Node hs = reverse(mid);

        Node hf = head;

        while (hf != null && hs != null) {

            Node temp = hf.next;

            hf.next = hs;

            hf = temp;

            temp = hs.next;

            hs.next = hf;

            hs = temp;
        }

        if (hf != null) {
            hf.next = null;
        }
    }

    // MERGE TWO SORTED LISTS
    public static Singly_linked_list merge(
            Singly_linked_list first,
            Singly_linked_list second) {

        Node f = first.head;

        Node s = second.head;

        Singly_linked_list ans = new Singly_linked_list();

        while (f != null && s != null) {

            if (f.value < s.value) {

                ans.insertLast(f.value);

                f = f.next;

            } else {

                ans.insertLast(s.value);

                s = s.next;
            }
        }

        while (f != null) {

            ans.insertLast(f.value);

            f = f.next;
        }

        while (s != null) {

            ans.insertLast(s.value);

            s = s.next;
        }

        return ans;
    }

    // NODE CLASS
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

    // MAIN METHOD
    public static void main(String[] args) {

        Singly_linked_list ll = new Singly_linked_list();

        ll.insertFirst(1);
        ll.insertFirst(1);
        ll.insertFirst(2);
        ll.insertFirst(2);

        System.out.println("Original List:");

        ll.display();

        ll.removeDuplicates();

        System.out.println("After Removing Duplicates:");

        ll.display();

        ll.reverse();

        System.out.println("After Reversing:");

        ll.display();

        System.out.println("Palindrome: " + ll.isPalindrome(ll.head));
    }
}