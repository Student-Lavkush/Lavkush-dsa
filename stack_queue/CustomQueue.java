package stack_queue;

public class CustomQueue {
   int end = 0;
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    public CustomQueue() {
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size) {
        this.data = new int[size];
    }
     public boolean isfull() {
        return end == data.length ;
    }

    public boolean isempty() {
        return end == 0;
    }
    public boolean insert(int item){
        if(isfull()){
            return false;
        }
        data[end++]=item;
        return true;
    }
    public int remove() throws Exception{
        if(isempty()){
            throw new Exception("Queue is null");
        }
        int remove = data[0];
        //for shifting
        for(int i =1;i<end;i++){
            data[i-1]=data[i];
        }
        end--;  
        return remove;
    }
    public int front() throws Exception{
        if(isempty()){
            throw new Exception("Queue is null");
        }
        return data[0];
    }
    public void dispaly(){
        for(int i =0;i<end;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println("END");

    }

}
