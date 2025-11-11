package stack_queue;

public class CircularQueue {
    protected int size =0;
    protected int end = 0;
    protected int front = 0;
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    public CircularQueue() {
        this(DEFAULT_SIZE);
    }
    public CircularQueue (int size) {
        this.data = new int[size];
    }
     public boolean isfull() {
        return size == data.length ;
    }

    public boolean isempty() {
        return size == 0;
    }
    public boolean insert(int item){
        if(isfull()){
            return false;
        }
        data[end++]=item;
        end = end%data.length;
        size++;
        return true;
    }
     public int remove() throws Exception{
        if(isempty()){
            throw new Exception("Queue is null");
        }
        int remove = data[front++];
        front = front%data.length;
        size--; 
        return remove;
    }
    public int front() throws Exception{
        if(isempty()){
            throw new Exception("Queue is null");
        }
        return data[front];
    }
     public void dispaly(){
        if(isempty()){
            System.out.println("Queue is empty");
        }
        int i = front;
        do{ 
            System.out.print(data[i]+" ");
            i++;
            i = i%data.length;
        }while(i!=end);
        System.out.println("END");
    }
}