package File_handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {
    

    //  try(InputStreamReader isr= new InputStreamReader(System.in)){
    // //     System.out.print("Enter some letters");
    // //     int letters = isr.read();
    // //     while(isr.ready()){
    // //         System.out.println((char)letters);
    // //         letters = isr.read();

    // //     }
        
    // //     System.out.println();
    // //  }
    // //  catch(IOException e){
    // //     System.out.println(e.getMessage());
    // //  }
    // // try(FileReader fr= new FileReader("note.txt")){
    // //     System.out.print("Enter some letters");
    // //     int letters = fr.read();
    // //     while(fr.ready()){
    // //         System.out.println((char)letters);
    // //         letters = fr.read();

    // //     }
        
    // //     System.out.println();
    // //  }
    // //  catch(IOException e){
    // //     System.out.println(e.getMessage());
    //  //}
    //  try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
    //     System.out.println("you typed" + br.readLine());
    //  }
    //  // byte to char stream then reading char stream
    //  catch(IOException e){
    //     System.out.println(e.getMessage());
    //  }
    //  OutputStream os = System.out;
    // //  os.write();
    //  System.out.println();
    //  try(OutputStreamWriter osw = new OutputStreamWriter(System.out)){
    //     osw.write("hrllo");
    //     osw.write(97);
    //     char[] arr = "hello world".toCharArray();
    //     osw.write(arr); 
    //  }
    //  catch(IOException e){
    //     System.out.println(e.getMessage());
    //  }
     try(BufferedWriter bw = new BufferedWriter(new FileWriter("note.txt"))){
       bw.write("hare ");
     }
     catch(IOException e){
        System.out.println(e.getMessage());
     }
}
}

