import java.util.Scanner;
public class s9 {
/**
 * @param args
 */
public static void main(String[] args){
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("enter first number (a):");
        double a=scanner.nextDouble();
        System.out.print("enter second number (b):");
        double b =scanner.nextDouble();
        System.out.println("Choose an operation:");
        System.out.println("1:+(Addition)");
        System.out.println("2:-(Subtraction)");
        System.out.println("3: *(Multiplication)");
        System.out.println("4: /(Division)");
        System.out.println("5: % (Modulo)");
        System.out.println("enter your choice (1-5):");
        int choice = scanner.nextInt();
        double result;
        switch(choice) {
            case 1 -> {
                result=a+b;
                System.out.println("Result:"+a+"+"+b+"="+result);
            }
            case 2 -> {
                result=a-b;
                System.out.println("Result:" + a +"-"+ b +"="+result);
            }
            case 3 -> {
                result=a*b;
                System.out.println("Result:"+a+"*"+b+"="+result);
            }
            case 4 -> {
                if(b!=0){
                    result =a/b;
                    System.out.println("Result:"+a+"/"+b+"="+result);
                } else {
                    System.out.println("error:division by zero!");
                }
            }
            case 5 -> {
                if(b!=0){
                    result=a%b;
                    System.out.println("Result:"+a+"%"+b+"="+result);
                } else {
                    System.out.println("error:modulo by zero!");
                }
            }
            default -> System.out.println("error: modulo by zero !");
        }
    }
}
}