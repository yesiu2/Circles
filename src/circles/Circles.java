package circles;

import java.util.Scanner;

public class Circles {

    public static void main(String[] args) {
        /*
        1,1,2
2,2,0.5
-1,-3,2
5,2,1
         */

        Scanner in = new Scanner(System.in);

        System.out.println("Ile kółek?");

        int inputSize = in.nextInt();

        Point north = new Point();
        Point south = new Point();
        Point east = new Point();
        Point west = new Point();

        for (int i = 0; i < inputSize; i++) {
            System.out.println("podaj x");
            double x = in.nextDouble();
            System.out.println("podaj y");
            double y = in.nextDouble();
            System.out.println("podaj promien");
            double radius = in.nextDouble();

            Circle c = new Circle(x, y, radius);

            Point maxNorth = c.maxNorth(x, y, radius);
            Point maxSouth = c.maxSouth(x, y, radius);
            Point maxEast = c.maxEast(x, y, radius);
            Point maxWest = c.maxWest(x, y, radius);

            if (i == 0) {
                north = maxNorth;
                south = maxSouth;
                east = maxEast;
                west = maxWest;
                continue;
            }

            if (maxNorth.getY() > north.getY()) {
                north = maxNorth;
            }
            if (maxSouth.getY() < south.getY()) {
                south = maxSouth;
            }

            if (maxEast.getX() > east.getX()) {
                east = maxEast;
            }

            if (maxWest.getX() < west.getX()) {
                west = maxWest;
            }
        }

        Point leftUp = new Point(west.getX(), north.getY());
        Point rightUp = new Point(east.getX(), north.getY());
        Point leftDown = new Point(west.getX(), south.getY());
        Point rightDown = new Point(east.getX(), south.getY());

        System.out.println(String.format("Współrzędne punktów to: \n %s \n %s \n %s \n %s",
                leftDown.toString(),
                leftUp.toString(),
                rightDown.toString(),
                rightUp.toString()));
    }
}
