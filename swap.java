import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        int a,b ;//, c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 no");
        a=sc.nextInt();
        b=sc.nextInt();
       /*  //third variable
        c=a;
        a=b;
        b=c;
        System.out.println(a+" "+b); */
//without third variable
a=a^b;
b=a^b;
a=a^b;
System.out.println(a+" "+b);

    }
}
