public class Calisan {
    private String ad,soyad;
    private int id;
    protected double ucret,saat;

    public Calisan(String a,String s,int ID,double ucret,double saat){
        ad=a;
        soyad=s;
        id=ID;
        this.ucret=ucret;
        this.saat=saat;
    }
    public String getAd(){
        return ad;
    }
    public String getSoyad(){
        return soyad;
    }
    public int getId(){
        return id;
    }
    public double getUcret(){
        return ucret;
    }

    public double getSaat() {
        return saat;
    }
    public double Kazanc(){
        return saat*ucret;
    }
}
