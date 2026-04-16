package LargeString;
import java.util.Random;
import java.text.DecimalFormat;
import java.util.Arrays;
//formattting a data
public class Main {
    public static void main(String[] args) {
        //constructor no. 1
        StringBuffer buffer = new StringBuffer();
        //constructor no. 2
         StringBuffer buffer2 = new StringBuffer("Lavkush");
         //constructor no.3 for capacity
          StringBuffer buffer3 = new StringBuffer(30);
        buffer.append("Lavkush");

        // buffer.append(" is nice");
        // // buffer.insert(2,"rahul");
        // buffer.replace(1,5,"kushwaha");

        // buffer.delete(1,5 );

        // buffer.reverse();


       int n =20;
       String name = RandomString.generate(n);
       System.out.println(name);
       //remove whitespaces
       String sentence = "ijh fen nun nefun nejnf";
       System.out.println(sentence);
       System.out.println(sentence.replaceAll("\\s","")) ;
       String arr = "Lavkush,Khushi,apoorva,hello";
       String[] na = arr.split(",");
       System.out.println(Arrays.toString(na));

       //rounding off
       DecimalFormat df = new DecimalFormat("000.00000");
       System.out.println(df.format(71.29));
    }
}
