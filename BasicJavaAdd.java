import java.util.Scanner;
class BasicJavaAdd {
    public static void main(String[] args) {
        int a,b,s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two no");
        a=sc.nextInt();
        b=sc.nextInt();
        s=a+b;
        System.out.println("Sum of two no="+s);
    }
}
