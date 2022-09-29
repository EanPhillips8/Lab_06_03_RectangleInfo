import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double length = 0;
        double width = 0;
        String Trash = "";
        double sqrL = (length * length);
        double sqrW = (width * width);
        double diagonal = (sqrL + sqrW);

        System.out.print("\n Enter the length of the rectangle: ");
        if(in.hasNextDouble()) {
            length = in.nextDouble();
        }
        else {
            Trash = in.nextLine();
            System.out.println("Error, please enter a valid number");
        }

        System.out.print("\n Enter the width of the rectangle: ");
        if(in.hasNextDouble()) {
            width = in.nextDouble();
        }
        else {
            Trash = in.nextLine();
            System.out.println("Error, please enter a valid number");
        }

        System.out.println("The perimeter of your rectangle is " + (length + width) * 2);

        sqrL = (length * length);
        sqrW = (width * width);
        diagonal = (sqrL + sqrW);

        System.out.println("The diagonal of the rectangle is " + Math.sqrt(diagonal) );
    }
}