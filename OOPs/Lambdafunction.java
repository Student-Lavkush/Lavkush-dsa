package OOPs;

import java.util.ArrayList;
import java.util.function.Consumer;

//lambda function is one line function.
public class Lambdafunction {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i);
        }
        // arr.forEach((item) -> System.out.println(item*2));//this is known as lambda
        // function
        Consumer<Integer> fun = (item) -> System.out.println(item * 2);
        //It’s part of java.util.function.
//It represents an operation that takes one input (a value) and does not return anything (i.e., returns void).
        arr.forEach(fun);
        Operation sum = (a,b) -> a+b;
         Operation prod = (a,b) -> a*b;
          Operation sub = (a,b) -> a-b;
Lambdafunction mycalculator = new Lambdafunction();
System.out.println(mycalculator.operate(12, 12, sum));

    }
private int operate(int a,int b,Operation op ){
    return op.operation(a, b);
}
      

}
//in this i am making like of consumer function only it take two argument.
 interface Operation{
    int operation(int a,int b);

 }