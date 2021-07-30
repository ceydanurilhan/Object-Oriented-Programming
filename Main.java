import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Second_Class nesne1= new Second_Class();

        Scanner inp= new Scanner(System.in);

        int sayi1,sayi2;
        int sonuc;

        sayi1=inp.nextInt();
        sayi2=inp.nextInt();

        //nesne1.Topla(sayi1,sayi2);

        //sonuc=nesne1.Toplama(sayi1,sayi2);
        //System.out.println(sonuc);

        System.out.println(nesne1.Toplama(sayi1,sayi2));

    }
}
