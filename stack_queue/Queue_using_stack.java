package stack_queue;
import java.util.Stack;

public class Queue_using_stack {
    public static void main(String[] args) {
        
        File stack = new File();
        stack.push(19);
        stack.push(20);
        System.out.println(stack.pop());
    }
}
 class File{
private Stack<Integer> first;
private Stack<Integer> second;
int item;
public File() {
first = new Stack<>();
    second = new Stack<>();
}
public File(int item) {
    this.item = item;
}
public void push(int item){
    first.push(item);

}
 public int pop() {
        
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int remove = second.pop();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return remove;
    }
    
    
    public int peek() {
         while(!first.isEmpty()){
            second.push(first.pop());
        }
        int remove = second.peek();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return remove;
    }
    
    public boolean empty() {
        return first.isEmpty() && second.isEmpty();
    }


}