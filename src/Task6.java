import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        int[] dataPoints = {1, 2, 3, 4, 5, 3, 2, 1, 3, 4};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value to search for: ");
        int userValue = scanner.nextInt();
        int count = 0;

        for (int dataPoint : dataPoints) {
            if (dataPoint == userValue) {
                count++;
            }
        }

        System.out.println("The value " + userValue + " was found " + count + " times in the array.");
    }
}
