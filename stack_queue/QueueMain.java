package stack_queue;

public class QueueMain {
    public static void main(String[] args) {
        CircularQueue que = new CircularQueue(5);
        que.insert(10);
         que.insert(10);
          que.insert(10);
           que.insert(10);
           que.insert(20);
            
             
             que.dispaly();
    }
}
