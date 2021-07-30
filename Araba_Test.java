public class Araba_Test {
    public static void main(String[] args) {

        int sonuc;

        Araba a1=new Araba();

        a1.setAll("opel",10,2);

        //sonuc=Araba.Hizlan(a1.getHiz(),a1.getIvme());
        sonuc=a1.Hizlan(a1.getHiz(),a1.getIvme());

        System.out.println("Sonuc:"+sonuc);


    }
}
