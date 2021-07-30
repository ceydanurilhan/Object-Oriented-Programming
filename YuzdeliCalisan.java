public class YuzdeliCalisan extends Calisan{
    private double yuzde;
    public YuzdeliCalisan(String a,String s,int ID,double ucret,double saat,double yuz){
        super(a,s,ID,ucret,saat);
        yuzde=yuz;
    }

    public double Kazanc(){
        double fazla;
        if(saat>20){
            fazla=super.saat-20;
            return (fazla*yuzde*ucret)+(20*ucret);
        }
        else{
            return super.Kazanc();
        }
    }
}
