package revision;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int arr[][]= new int [3][3];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the values");
    
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
            arr[i][j]=input.nextInt();
            }}
for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for(int i =0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        }
        
    
}
