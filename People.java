public class People {
    private String ad,cins;
    private int yas;
    private double boy,kilo;

    public People(String name,String sex,int age,double height,double weight){
        ad=name;
        cins=sex;
        yas=age;
        boy=height;
        kilo=weight;
    }

    public People(String name, String sex){
        ad=name;
        cins=sex;
    }

    public People(){
    }

    public void setAd(String name){
        ad=name;
    }
    public void setCins(String sex){
        cins=sex;
    }
    public void setBoy(double height){
        boy=height;
    }
    public void setKilo_Yas(double weight,int age){
        kilo=weight;
        yas=age;
    }
    public String getAd(){
        return ad;
    }
    public String getCins(){
        return cins;
    }
    public int getYas(){
        return yas;
    }
    public double getBoy(){
        return boy;
    }

    public double getKilo() {
        return kilo;
    }
}
