import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_1 {


    public static void main(String[] args) {

        int a,b;

        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Enter First Number: ");
            a = sc.nextInt();
            System.out.print("Enter Second Number: ");
            b = sc.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("Enter a number not a symbols");
            return;
        }

        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println("You cant divide zero");
        }



    }
}