package stack_queue;

public class StackMain {
    public static void main(String[] args) throws Exception {
        DyanamicStack stack = new DyanamicStack(5);
        stack.push(10);
        stack.push(10);
        stack.push(10);
        stack.push(10);
        stack.push(10);
        stack.push(19);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

}
