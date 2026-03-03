import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base in cm: ");
        double base = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        double height = sc.nextDouble();

        // Area in square cm
        double areaCm = 0.5 * base * height;

        // Convert to square inches
        double areaInches = areaCm / (2.54 * 2.54);

        System.out.println("Area in square centimeters: " + areaCm);
        System.out.println("Area in square inches: " + areaInches);

        sc.close();
    }
}