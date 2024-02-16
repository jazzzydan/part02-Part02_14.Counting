
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.valueOf(scanner.nextLine());

            // for (*introducing a variable*; *condition*; *increasing the counter*) {
            // Functionality to be executed
            // }

        for (int count = 0; count <= number; count++) {
            System.out.println(count);
        }
    }
}
