import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double rectWidth = 0.0;
        double rectHeight = 0.0;

        boolean validWidth = false;
        boolean validHeight = false;

        double rectArea = 0.0;
        double rectPerimeter = 0.0;
        double rectHypotenuse = 0.0;

        do {
            System.out.print("Enter the width of the rectangle: ");
            if (in.hasNextDouble()) {
                rectWidth = in.nextDouble();
                in.nextLine();
                validWidth = true;
            } else {
                System.out.println("Please enter a valid width");
                in.nextLine();
            }
        } while (!validWidth);

        do {
            System.out.print("Enter the height of the rectangle: ");
            if (in.hasNextDouble()) {
                rectHeight = in.nextDouble();
                in.nextLine();
                validHeight = true;
            } else {
                System.out.println("Please enter a valid height");
                in.nextLine();
            }
        } while (!validHeight);

        rectArea = rectWidth * rectHeight;
        rectPerimeter = ( rectWidth * 2 ) + (rectHeight * 2);
        rectHypotenuse = sqrt( Math.pow(rectWidth,2) + Math.pow(rectHeight,2) );

        System.out.printf("The area of the rectangle is: %.2f, the perimeter of the " +
                "rectangle is %.2f, and the hypotenuse of the rectangle is %.2f", rectArea,
                rectPerimeter, rectHypotenuse);

    }
}