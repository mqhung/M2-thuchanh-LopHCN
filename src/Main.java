import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your width: " + "\t");
        double width = sc.nextDouble();
        System.out.print("Enter you height: " + "\t");
        double height = sc.nextDouble();
        Rectangular rec1 = new Rectangular(width,height);
        System.out.println("Rectangular is: " + rec1.display());
        System.out.println("Area is: " + rec1.getArea());
        System.out.println("Perimeter is: " + rec1.getPerimeter());
    }
}
