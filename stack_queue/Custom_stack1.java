package stack_queue;

public class Custom_stack1 {
    int ptr = -1;
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    public Custom_stack1(int size) {
        this.data = new int[size];
    }

    public Custom_stack1() {
        this(DEFAULT_SIZE);// using this we call a constructor of upper constructor
    }

    public boolean push(int item) {
        if (isfull()) {
            System.out.println("array is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws Exception {
        if (isempty()) {
            throw new Exception("it is empty");
        }
        return data[ptr--];
    }
    public int peek() throws Exception{
        if(isempty()){
            throw new Exception("no data ");
        }
        return data[ptr];
    }

    public boolean isfull() {
        return ptr == data.length - 1;
    }

    public boolean isempty() {
        return ptr == -1;
    }

}
