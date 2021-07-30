import java.util.Random;

public class ZardanKacKezGeldi {
    public static void main(String[] args) {

        int freq[]={0,0,0,0,0,0};
        int i;
        int zar;

        for(i=0;i<10;i++){
            zar=ZarAt();
            System.out.println("Gelen Zar:"+zar);

            switch (zar){
                case 1:
                    freq[0]++;
                    break;
                case 2:
                    freq[1]++;
                    break;
                case 3:
                    freq[2]++;
                    break;
                case 4:
                    freq[3]++;
                    break;
                case 5:
                    freq[4]++;
                    break;
                case 6:
                    freq[5]++;
                    break;
            }

        }
        System.out.println("FREKANSLAR");

        for(i=0;i<freq.length;i++){
            System.out.printf("%d. rakamdan %d tane geldi\n",i+1,freq[i]);
        }

    }
    public static int ZarAt(){
        Random n=new Random();
        return 1+n.nextInt(6);
    }
}
