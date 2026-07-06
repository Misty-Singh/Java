import java.util.Scanner;
public class s5{
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            int number = scanner.nextInt();
            for(int i=1;i<=10;i++){
                System.out.println(number + " * " + i + " = " + (number*i));
            }       }
    }
    
}