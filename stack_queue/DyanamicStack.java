package stack_queue;

public class DyanamicStack extends Custom_stack1 {

   public DyanamicStack(int size){
        super(size);
    }
    public DyanamicStack(){
        super();
    }
    @Override
    public boolean push(int item) {
       //copying all old element into new elemnt
      
        int[] temp = new int[data.length*2];
        if(isfull()){
        for(int i =0;i<data.length;i++){
            temp[i]=data[i];
        }}
    
        data = temp;
    
        return super.push(item);
    }
    
}
