import java.util.Random;
public class KartDestesi {
    private int KART_SAYISI=52;

    private Kart [] deste;
    int i;

    public KartDestesi(){
        String [] No={"As","Papaz","Kiz","Vale","2","3","4","5","6","7","8","9","10"};
        String [] Tur={"Kupa","Karo","Sinek","Maca"};

        deste= new Kart[KART_SAYISI];

        for(i=0;i<deste.length;i++){
            deste[i]=new Kart(No[i%13],Tur[i/13]);
        }
    }
    public void KartKaristir(){
        int birinci,ikinci;
        Random rnd=new Random();

        for(birinci=0;birinci<deste.length;birinci++){
            ikinci=rnd.nextInt(KART_SAYISI);
            Kart temp=deste[birinci];
            deste[birinci]=deste[ikinci];
            deste[ikinci]=temp;
        }

    }
    public Kart Dagit(){
        int siradaki=0;
        if(siradaki<deste.length){
            return deste[siradaki];
        }
        else{
            return null;
        }
    }
}
