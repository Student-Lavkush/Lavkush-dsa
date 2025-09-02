package OOPs.Deep_copy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human kunal = new Human(19,"Lavkush");
     
      Human twin = (Human)kunal.clone();
        System.out.println(twin.age+" "+twin.name);
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0] =100;
        System.out.println(Arrays.toString(twin.arr));
    }
}
