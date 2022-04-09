import java.util.Scanner;

public class Name {
    public static String getName() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        return input.nextLine();
    }
}
