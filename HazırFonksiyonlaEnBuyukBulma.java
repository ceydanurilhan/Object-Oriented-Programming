import java.util.Scanner;

public class HazırFonksiyonlaEnBuyukBulma {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        int s1,s2,s3,sonuc;
        s1=inp.nextInt();
        s2= inp.nextInt();
        s3=inp.nextInt();

        sonuc=Math.max(s1,(Math.max(s2,s3)));
        System.out.println("sonuc:"+sonuc);
    }
}
