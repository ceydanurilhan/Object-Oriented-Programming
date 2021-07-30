public class CalisanTest {
    public static void main(String[] args) {
        Calisan c1=new Calisan("ali","veli",123,100,20);
        YuzdeliCalisan c2=new YuzdeliCalisan("ASD","DSA",125,100,30,0.5);

        System.out.println(c1.getAd()+" "+c1.getSoyad()+" "+" Alacagi Ucret= "+c1.Kazanc());
        System.out.println(c2.getAd()+" "+c2.getSoyad()+" "+" Alacagi Ucret= "+c2.Kazanc());
    }
}
