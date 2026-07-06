import java.util.Scanner;
public class s8{
public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Enter the number of the month(1-12): ");
        @SuppressWarnings("unused")
        int month = scanner.nextInt();
    }
}
}