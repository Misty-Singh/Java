
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        String name,address;
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        name=sc.next();
         System.out.println("Enter your age");
        age=sc.nextInt();
         System.out.println("Enter address");
        address=sc.next();
        System.out.println("Name:"+name+"\n"+"Address:"+address+"\n"+"Age:"+age);
    }
}
