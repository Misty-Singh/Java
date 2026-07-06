
import java.util.Scanner;

public class Char {
    public static void main(String[] args) {
        Char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any char");
        ch=sc.next().charAt(0);
        if((ch>=65&&ch<=90)||(ch>=97&&ch<=122))
        {
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                System.out.println("vowel");
            }
            else
            {
                System.out.println("Consonant");
            }
        }
        else
        {
            System.out.println("Invalid char");
        }
    }
}
