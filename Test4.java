import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Ogrenci o1=new Ogrenci("Ali",50,60);
        Ogrenci o2=new Ogrenci();

        String name;
        int n1,n2;

        Scanner inp=new Scanner(System.in);

        System.out.println("Isim gir:");
        name=inp.nextLine();
        o2.setAd(name);
        System.out.println("Not1 Gir:");
        n1=inp.nextInt();
        System.out.println("Not2 Gir:");
        n2=inp.nextInt();
        o2.setNots(n1,n2);

        System.out.println("Birinci Ogrencinin adi: "+o1.getAd()+" Birinci Ogrencinin Not Ortalamasi:"+o1.Ortalama(o1.getNot1(),o1.getNot2()));

        System.out.println("Ikinci Ogrencinin adi: "+o2.getAd()+" Ikinci Ogrencinin Not Ortalamasi:"+o2.Ortalama(o2.getNot1(),o2.getNot2()));
    }
}
