import java.util.Random;

public class ZarAtma {
    public static void main(String[] args) {
        Random num=new Random();

        int zar1,zar2;

        zar1=ZarToplam(num);
        zar2=ZarToplam(num);

        if((zar1+zar2)%2==0){
            System.out.println("Zar toplami:"+(zar1+zar2)+" Cift Sayi");
        }
        else {
            System.out.println("Zar toplami:"+(zar1+zar2)+" Tek Sayi");
        }

    }
    public static int ZarToplam(Random r){
        int sonuc;
        sonuc=1+r.nextInt(6);
        return sonuc;
    }
}
