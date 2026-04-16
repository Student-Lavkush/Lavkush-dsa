package HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
HashMap<String,Integer> map = new HashMap<>();//key is String and value is Integer
  map.put("kunal",99);
map.put("lavkus",98);
map.put("Khushi",100);
System.out.println(map.values());
// System.out.println(map.get("Khushi"));//it not traversing
//   System.out.println(map.getOrDefault("appova",88));
TreeSet<Integer> set = new TreeSet<>();//duplicay is not allowed// allows in sorted order
set.add(56);
set.add(2);
set.add(2);
set.add(9);
System.out.println(set);
 }

}
