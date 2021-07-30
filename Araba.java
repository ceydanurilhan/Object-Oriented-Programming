public class Araba {
    private String marka;
    private int hiz,ivme;

    public void setAll(String m,int h,int i){
        marka=m;
        hiz=h;
        ivme=i;
    }
    public int getIvme(){
        return ivme;
    }
    public int getHiz(){
        return hiz;
    }
    public static int Hizlan(int h,int i){
        return (h*i);
    }
}
