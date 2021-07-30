import java.util.Scanner;

public class EnBuyukBulma {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        int s1,s2,s3,sonuc;
        s1=inp.nextInt();
        s2=inp.nextInt();
        s3= inp.nextInt();

        //sonuc=EnBuyukBulma.EnBuyuk(s1,s2,s3);
        sonuc=EnBuyuk(s1,s2,s3);
        System.out.println(sonuc);
    }

    public static int EnBuyuk(int s1,int s2,int s3){
        int eb;
        eb=s1;
        if(s2>eb){
            eb=s2;
        }
        if(s3>eb){
            eb=s3;
        }
        return eb;
    }
}
