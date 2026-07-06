
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        int a;
        float b;
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any int value:");
        a=sc.nextInt();
        System.out.println("Enter any float value");
        b=sc.nextFloat();
        System.out.println("Enter any string");
        s=sc.next();
        System.out.println( a);
        System.out.println( b);
        System.out.println( s);
    }
}