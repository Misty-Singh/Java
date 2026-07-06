import java.util.Scanner;
public class s4{
 public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the radius of the circle: ");
            float radius = scanner.nextFloat();
            float area = 3.14f*radius*radius;
            System.out.println("Radius: "+radius);
            System.out.println("Area: "+area);
            scanner.close();
        }
    }
}