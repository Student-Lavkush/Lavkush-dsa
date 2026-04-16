package revision;
class Abc{
    void sum(int a,int b){
        System.out.println((a+b)+" parent class");
    }
}

class Pqr extends Abc{
    void hello(int a,int b){
    
    }
}

public class ArrayExample {
    public static void main(String[] args){
        Abc obj1 = new Abc();
        obj1.sum(5,10);

        Abc obj2 = new Pqr();
        obj2.sum(5,10);
    }
}