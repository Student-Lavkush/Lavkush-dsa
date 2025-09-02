package OOPs.comparing_the_object;

public class Main {
    public static void main(String[] args) {
        
    
  Student kunal = new Student(12,123 ); 
   Student aryan = new Student(11,1234 ); 
   if(kunal.compareTo(aryan)<0){
    System.out.println("aryan has less marks");
   }
       
}
}