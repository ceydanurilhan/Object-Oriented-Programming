public class Kart {
    private String KartNo,KartTuru;
    public Kart(String no,String tur){
        KartNo=no;
        KartTuru=tur;
    }
    public String ToString(){
        return KartTuru+" "+KartNo;
    }
}
