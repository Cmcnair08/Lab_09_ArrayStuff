import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dataPoints = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        System.out.print("Please enter a value between 1 and 100: ");
        int userValue = scanner.nextInt();
        boolean found = false;

        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userValue) {
                System.out.println("The value " + userValue + " was found at array index " + i + ".");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("The value " + userValue + " was not found in the array.");
        }

        scanner.close();
    }
}
