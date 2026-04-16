package File_handling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Files {
    public static void main(String[] args) {

        // 1️⃣ Create file
        try {
            File fo = new File("note.txt");
            if (fo.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // 2️⃣ Write into file
        try {
            FileWriter fw = new FileWriter("note.txt");
            fw.write("hello");
            fw.close(); // VERY IMPORTANT
            System.out.println("Data written to file");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // 3️⃣ Read file
        try (FileReader fr = new FileReader("note.txt")) {
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
