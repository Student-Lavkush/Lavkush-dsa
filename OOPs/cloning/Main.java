package OOPs.cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human kunal = new Human(19,"Lavkush");
     
      Human khush = (Human)kunal.clone();
        System.out.println(khush.age+" "+khush.name);
    }
}
