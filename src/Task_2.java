import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {

        String number_stg;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        number_stg = sc.nextLine();

        try {
            System.out.println(Integer.parseInt(number_stg));
        }
        catch (NumberFormatException e) {
            System.out.println("This is not a number");
        }

    }
}