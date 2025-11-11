package stack_queue;

public class DyanamicQueue extends CircularQueue {
    
   public DyanamicQueue(int size){
        super(size);
    }
    public DyanamicQueue(){
        super();
    }
    @Override
    public boolean insert(int item) {
         int[] temp = new int[data.length*2];
        if(isfull()){
        for(int i =0;i<data.length;i++){
            temp[i]=data[(front+i)%data.length];
        }
        front =0;
        end = data.length;
        data = temp;
    }
        return super.insert(item);
    }
    
}
