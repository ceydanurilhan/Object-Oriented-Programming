import java.util.Random;

public class ZarOyunu {
    private enum Durum{Kazan,Kaybet,Devam};

    public static void main(String[] args) {
        Random num= new Random();
        int puan=0;
        Durum OyunDurumu;

        int ZarToplami=ZarAt(num);

        System.out.println("Toplam: "+ZarToplami);

        switch (ZarToplami){
            case 7:
            case 11:
                OyunDurumu=Durum.Kazan;
                break;
            case 2:
            case 3:
            case 12:
                OyunDurumu=Durum.Kaybet;
                break;
            default:
                OyunDurumu=Durum.Devam;
                puan=ZarToplami;
                System.out.println("Puan: "+puan);
        }
        while (OyunDurumu==Durum.Devam){
            ZarToplami=ZarAt(num);
            System.out.println("Toplam: "+ZarToplami);
            if(ZarToplami==puan){
                OyunDurumu=Durum.Kazan;
            }
            else{
                if(ZarToplami==7){
                    OyunDurumu=Durum.Kaybet;
                }
            }
        }
        if(OyunDurumu==Durum.Kazan){
            System.out.println("KAZANDINIZ");
        }
        else{
            System.out.println("KAYBETTİNİZ");
        }
    }
    public static int ZarAt(Random r){
        return (1+r.nextInt(6))+(1+r.nextInt(6));
    }
}
