import java.util.Scanner;

public class CustomerInformation {
    public static String Name() {
        Scanner input = new Scanner (System.in);

        String name;

        System.out.println("Enter your name:");
        name = input.nextLine();

        return name;
    }
}
