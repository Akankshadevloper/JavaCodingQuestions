public class DistanceCalculator {

        public static void main(String[] args) {
            // Example points
            double x1 = 3.0;
            double y1 = 4.0;
            double x2 = 7.0;
            double y2 = 1.0;

            // Calculate distance
            double distance = calculateDistance(x1, y1, x2, y2);

            // Print result
            System.out.println("The distance between (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is " + distance);
        }

        public static double calculateDistance(double x1, double y1, double x2, double y2) {
            double deltaX = x2 - x1;
            double deltaY = y2 - y1;
            return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
        }
    }


