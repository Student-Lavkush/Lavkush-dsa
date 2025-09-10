package OOPs.Collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
public class Vector_example{
public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    List<Integer> list1 = new LinkedList<>();
    list1.add(10);
     list1.add(20);
      list1.add(130);
       list1.add(120);
       System.out.println(list1);
List<Integer> list2 = new Vector<>();
list2.add(45);
list2.add(15);
list2.add(16);
System.out.println(list2);
}
}
