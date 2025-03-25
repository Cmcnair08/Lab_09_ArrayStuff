public class Task9 {
    public static void main(String[] args) {
        double[] dataPoints = {10.5, 20.0, 30.5, 40.0, 50.5};
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }

    public static double getAverage(double values[]) {
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        return sum / values.length;
    }
}

