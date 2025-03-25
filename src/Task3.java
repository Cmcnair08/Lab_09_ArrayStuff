import java.util.Random;
public class Task3 {
    public static void main(String[] args) {

        int[] dataPoints = {1, 2, 3, 4, 5};
        for (int i = 0; i < dataPoints.length; i++) {

        }
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
    }
}
