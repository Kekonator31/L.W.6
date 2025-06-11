import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class Task_3 {
    public static void main(String[] args){

            try {
                File textFile = new File("text.txt");
                Scanner sc = new Scanner(textFile);

                    while (sc.hasNextLine()) {
                        String line = sc.nextLine();
                        System.out.println(line);
                    }
            }
            catch (FileNotFoundException e) {
                System.out.println("File not found");
            }

        try {
            File textFile = new File("text.txt");
            Scanner sc = new Scanner(textFile);

                while (sc.hasNextLine()) {
                    String line = sc.nextLine();
                    System.out.println(line);
                }
        }
        catch (IOException e) {
            System.out.println("File not found");
        }
        finally {
            System.out.println("Try to work with file is done");
        }








    }
}