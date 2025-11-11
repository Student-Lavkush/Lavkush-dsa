package linkedlist;

public class Main {
    
        
    public static void main(String[] args) {
        Singly_linked_list first = new Singly_linked_list();
        Singly_linked_list second = new Singly_linked_list();

        first.insertLast(1);
        first.insertLast(2);
        first.insertLast(3);
        first.insertLast(4);
        second.insertLast(1);
    second.insertLast(3);
        second.insertLast(5);
        second.insertLast(6);
        second.insertLast(7);
        second.insertLast(8);
        Singly_linked_list ans = Singly_linked_list.merge(first, second);
ans.display();

        
        // ll.insert(100, 2);
        // ll.display();
        // System.out.println(ll.deletionFirst());
        // ll.display();
        // System.out.println(ll.deletionlast());
        // ll.display();
        // System.out.println(ll.delete(2));
        // ll.display();
        // System.out.println(ll.find(100));
        // System.out.println(ll.delete(2));
        // System.out.println(ll.delete(1));
        // ll.display();
        // System.out.println(ll.find(22));
        //***************************************************************************--------------------
        // Doubly_linked_list ll = new Doubly_linked_list();

        // ll.insertFirst(3);
        // ll.insertFirst(12);
        // ll.insertFirst(24);
        // ll.insertFirst(19);
        // ll.display();
        // ll.insertLast(10);
        // ll.display();
        //******************************************------------------------ */
        // Circular_linked_list ll = new Circular_linked_list();
        // ll.insert_last(23);
        //  ll.insert_last(4);
        //   ll.insert_last(22);
        //    ll.insert_last(29);
        //    ll.display();
        //    ll.delete(4);
        //    ll.display(); 


    }
}
