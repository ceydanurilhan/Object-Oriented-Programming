public class Ogrenci {
    private String ad;
    private int not1,not2;

    public Ogrenci(String name, int n1,int n2){
        ad=name;
        not1=n1;
        not2=n2;
    }
    public Ogrenci(){
    }

    public void setAd(String name){
        ad=name;
    }
    public void setNots(int n1,int n2){
        not1=n1;
        not2=n2;
    }
    public String getAd(){
        return ad;
    }
    public int getNot1(){
        return not1;
    }
    public int getNot2(){
        return not2;
    }
    public int Ortalama(int n1,int n2){
        return (n1+n2)/2;
    }
}
