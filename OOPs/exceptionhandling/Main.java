package OOPs.exceptionhandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try{//try all the things that happen
       //   divide(a,b);
       String name = "Kunal";//that is making own custom exception
       if(name.equals(name)){
        throw new Custom_exception("name is kunal");
       }
        }
        catch(Custom_exception e){
            System.out.println(e.getMessage());
        }

          
        catch(ArithmeticException e){//and catch it over here
            System.out.println(e.getMessage());
        }
        catch(Exception e){//and catch it over here
            System.out.println("Already catch");
        }
       // finally{
         //   System.out.println("this will always execute");
        //}
        

    }
    static int divide (int a,int b)throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException ("please do not divide by zero");
            //throw means basically we throw an exception.
            //throws basically means declare an exception.
        }
        return a/b;
    }
}
