import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

        int[] dataPoints = {1, 2, 3, 4, 5};

        // First loop to process dataPoints (if needed)
        for (int i = 0; i < dataPoints.length; i++) {
            // Processing logic can go here
        }

        // Second loop to display dataPoints values
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
    }
}
