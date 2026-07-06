import javs.util.*;
class char {
    public static void main(String[] args){
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any char");
        ch=sc.next().charAt(0);
        if(ch>=65&&ch<=90)
            System.out.println("Uppercase");
        else if(ch>=97&&ch<=122)
            System.out.println("Lower Case");
    }
}
