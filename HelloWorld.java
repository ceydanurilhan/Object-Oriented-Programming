import java.util.*;
public class HelloWorld {
    public static void main(String[] args) {
        int s1;
        int s2;
        int top;

        Scanner inp= new Scanner(System.in);

        System.out.println("Sayi gir:");
        s1=inp.nextInt();
        System.out.println("Ikinci sayiyi gir:");
        s2=inp.nextInt();

        top=s1+s2;

        System.out.println("Toplam:"+top);

    }
}
