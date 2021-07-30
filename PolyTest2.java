import java.util.Random;

public class PolyTest2 {
    public static void main(String[] args) {
        Calisann [] calisanlar = new Calisann[3];
        int i,j;
        for (i=0;i<3;i++){
            calisanlar[i]=CalisanSec();
        }
        for (j=0;j<3;j++){
            BenKimim(calisanlar[j]);
        }

    }

    public static Calisann CalisanSec(){
        Random rnd=new Random();
        int sec;
        sec=rnd.nextInt(3);

        Calisann c1=null;

        if(sec==0){
            c1=new Calisann();
        }
        if(sec==1){
            c1=new Muhendis();
        }
        if(sec==2){
            c1=new Patron();
        }
        return c1;
    }
    public static void BenKimim(Calisann a){
        a.mtd();
    }
}


