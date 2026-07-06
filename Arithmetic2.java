public class Arithmetic2 {
    public static void main(String[] args) {
        boolean x;
        int a=5, b=7;
        x=a>b&&a<b;
        System.out.println(x);
        x=a>b||a<b;
        System.out.println(x);
        x=!(a>b&&a<b);
        System.out.println(x);
        
    }
}
