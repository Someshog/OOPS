
import java.util.Scanner;

public class string {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder buffer = new StringBuilder();
        System.out.println("Enter a Sentence: ");
        String str = input.nextLine();
        String arr[] = str.split(" ");
        System.out.println("Enter a Character: ");
        String chr = input.next();
        // for (int i = 0; i < arr.length; i++) {

        //     System.out.printf("%s ", arr[i]);
        // }
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].startsWith(chr)) {
                buffer.append("@").append(Character.toUpperCase(arr[i].charAt(0))).append(arr[i].substring(1)).append(" ");


            }

        }
        System.out.printf("%s ", buffer);

        // System.out.printf("%s", chr);
    }
}
