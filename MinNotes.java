import java.util.*;

public class MinNotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a four-digit number: ");
        int amount = scanner.nextInt();

       
       
        System.out.println("Amount: " + amount);

        // Calculate minimum notes required
        int notes500 = amount / 500;
        amount %= 500;

        int notes200 = amount / 200;
        amount %= 200;

        int notes100 = amount / 100;
        amount %= 100;

        int notes50 = amount / 50;
        amount %= 50;

        // Display the result
        System.out.println("500 Notes: " + notes500);
        System.out.println("200 Notes: " + notes200);
        System.out.println("100 Notes: " + notes100);
        System.out.println("50 Notes: " + notes50);

        // If there is any remaining amount that cannot be represented by available notes
        if (amount > 0) {
            System.out.println("Remaining amount that cannot be represented: " + amount);
        }
    }
}