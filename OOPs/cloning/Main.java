package OOPs.cloning;

public class Main {
    public static void main(String[] args) {
        Human kunal = new Human(19,"Lavkush");
        Human khush = new Human(kunal);
        System.out.println(khush.age);
    }
}
