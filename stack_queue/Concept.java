package stack_queue;

import java.util.*;

public class Concept {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(10);
        System.out.println(stack.pop());
        Queue<Integer> queue= new LinkedList<>();//because queue is interface.
    
        Deque<Integer> deque = new ArrayDeque<>();// 1-arraydeque is faster than the Linked list
        //2- it helps in tree when we doing tree
    }
}
